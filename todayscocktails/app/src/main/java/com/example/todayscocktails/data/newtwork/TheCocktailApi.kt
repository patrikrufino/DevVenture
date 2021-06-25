package com.example.todayscocktails.data.newtwork

import com.example.todayscocktails.data.DrinksListRemoteEntity
import retrofit2.http.GET

interface TheCocktailApi {
    @GET("filter.php?a=Alcoholic")
    suspend fun getDrinks(): DrinksListRemoteEntity
}