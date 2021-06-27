package com.example.todayscocktails.data.network

import com.example.todayscocktails.data.model.DrinkRemoteEntity
import com.example.todayscocktails.data.model.DrinksListRemoteEntity
import retrofit2.http.GET
import retrofit2.http.Query

interface TheCocktailApi {
    @GET("filter.php?a=Alcoholic")
    fun getDrinks(): DrinksListRemoteEntity

    @GET("lookup.php")
    fun getNameById(@Query(
    "i"
    )
    id : Int ): DrinkRemoteEntity
}