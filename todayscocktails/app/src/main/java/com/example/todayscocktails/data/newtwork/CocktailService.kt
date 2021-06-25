package com.example.todayscocktails.data.newtwork

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://www.thecocktaildb.com/api/json/v1/1/"

private val retrofit =
    Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

object CocktailService {
    val service: TheCocktailApi by lazy {
        retrofit.create(TheCocktailApi::class.java)
    }
}