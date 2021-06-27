package com.example.todayscocktails.data.repository

import com.example.todayscocktails.data.model.DrinkRemoteEntity

interface IDrinkRepository {
    suspend fun getAllDrinks(): List<DrinkRemoteEntity>?
}
