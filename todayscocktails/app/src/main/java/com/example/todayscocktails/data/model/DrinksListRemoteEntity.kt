package com.example.todayscocktails.data.model

import com.google.gson.annotations.SerializedName

data class DrinksListRemoteEntity(
    @SerializedName("drinks")
    val drinks: List<DrinkRemoteEntity>
)