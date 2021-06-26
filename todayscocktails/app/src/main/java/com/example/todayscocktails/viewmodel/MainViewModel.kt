package com.example.todayscocktails.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class MainViewModel {
    class MainViewModel(private val repository: DrinkItemRepository): ViewModel() {
        val learnedItems: LiveData<List<DrinkItem>> = repository.learnedItems
    }
}