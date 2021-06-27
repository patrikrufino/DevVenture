package com.example.todayscocktails.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "drinks_entity")
data class DrinkRemoteEntity(
    @PrimaryKey
    @SerializedName("idDrink")
    @ColumnInfo(name = "id")
    val id: String,
    @ColumnInfo(name = "strDrink")
    val strDrink: String,
    @ColumnInfo(name = "strDrinkThumb")
    val strDrinkThumb: String)