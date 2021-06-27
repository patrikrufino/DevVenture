package com.example.todayscocktails.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.bumptech.glide.Glide
import com.example.todayscocktails.R
import com.example.todayscocktails.data.model.DrinksListRemoteEntity
import com.example.todayscocktails.data.network.CocktailService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class DrinkItemActivity : AppCompatActivity() {

    // Variables
    lateinit var drinkTitle: TextView
    lateinit var drinkThumb: ImageView
    lateinit var buttonGetDrink: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink_item)

        drinkTitle = findViewById(R.id.drinkTitle)
        drinkThumb = findViewById(R.id.drinkThumb)
        buttonGetDrink= findViewById(R.id.buttonGetDrink)


        getDrink()


    }

    private fun getDrink() {
        lifecycleScope.launch {
            try {
                val response = requestDrinks()
                val drink = response.drinks.random()
                drinkTitle.text = drink.strDrink
                Glide.with(this@DrinkItemActivity)
                    .load(drink.strDrinkThumb)
                    .into(drinkThumb)
            } catch (e: Exception) {
                Toast.makeText(this@DrinkItemActivity, e.message, Toast.LENGTH_LONG).show()
            }
        }
    }

    private suspend fun requestDrinks(): DrinksListRemoteEntity {
        return withContext(Dispatchers.IO) {
            CocktailService.service.getDrinks()
        }
    }
}