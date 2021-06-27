package com.example.todayscocktails.di

import com.example.todayscocktails.data.db.CocktailDatabase
import com.example.todayscocktails.data.repository.DrinkRepository
import com.example.todayscocktails.viewmodel.DrinkViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object AppModule {
    val module = module {
        factory {
            DrinkRepository(get())
        }
        single {
            CocktailDatabase.getDatabase(context = get())
        }
        single {
            get<CocktailDatabase>().drinksDao()
        }
        viewModel{
            DrinkViewModel(get())
        }
    }

}