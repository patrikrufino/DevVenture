package com.example.todayscocktails.data.repository

import com.example.todayscocktails.data.db.DrinkDao
import com.example.todayscocktails.data.model.DrinkRemoteEntity
import com.example.todayscocktails.data.network.CocktailService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class DrinkRepository(private val dao: DrinkDao) : IDrinkRepository {

    override suspend fun getAllDrinks(): List<DrinkRemoteEntity>? {
        return getDrinksFromDB()
    }

    private suspend fun getDrinksFromDB(): List<DrinkRemoteEntity>? {
        var drinks: List<DrinkRemoteEntity>? = dao.getAllDrinks()
        if (drinks.isNullOrEmpty())
            drinks = getDrinksFromAPI()
        return drinks
    }

    private suspend fun getDrinksFromAPI(): List<DrinkRemoteEntity>? {
        return withContext(Dispatchers.IO) {
            val response = CocktailService.service.getCocktail()
            response.body()?.drinks
        }
    }

}