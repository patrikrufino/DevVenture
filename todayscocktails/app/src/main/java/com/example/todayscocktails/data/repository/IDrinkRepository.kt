package com.example.todayscocktails.data.repository

import com.example.todayscocktails.DrinkDetails
import com.example.todayscocktails.data.model.DrinkRemoteEntity

interface IDrinkRepository {
    suspend fun getAllDrinks(): List<DrinkRemoteEntity>?
    suspend fun getDrinkByName(name: String): DrinkDetails?
}
