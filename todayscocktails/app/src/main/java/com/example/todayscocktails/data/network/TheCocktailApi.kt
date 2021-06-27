package com.example.todayscocktails.data.network

import com.example.todayscocktails.data.model.DrinksListRemoteEntity
import retrofit2.http.GET

interface TheCocktailApi {
    @GET("filter.php?a=Alcoholic")
    suspend fun getDrinks(): DrinksListRemoteEntity
}