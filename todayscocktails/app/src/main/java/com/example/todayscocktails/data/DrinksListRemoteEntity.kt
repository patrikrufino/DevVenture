package com.example.todayscocktails.data

import com.google.gson.annotations.SerializedName

data class DrinksListRemoteEntity(
    @SerializedName("drinks")
    val drinksList: List<DrinkRemoteEntity>
)