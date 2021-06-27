package com.example.todayscocktails.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.example.todayscocktails.data.model.DrinkRemoteEntity

@Dao
interface DrinkDao {

    @Query("SELECT * FROM drinks_entity")
    fun getAllDrinks(): List<DrinkRemoteEntity>?
}