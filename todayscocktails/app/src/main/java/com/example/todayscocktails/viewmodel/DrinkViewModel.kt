package com.example.todayscocktails.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todayscocktails.DrinkDetails
import com.example.todayscocktails.data.model.DrinkRemoteEntity
import com.example.todayscocktails.data.repository.DrinkRepository
import kotlinx.coroutines.launch

class DrinkViewModel(private val repository: DrinkRepository) : ViewModel() {

    private var drinks: MutableLiveData<List<DrinkRemoteEntity>> = MutableLiveData()
    private var drinkDetails: DrinkDetails? = null

    fun getDrinks(): LiveData<List<DrinkRemoteEntity>> {
        viewModelScope.launch {
            val result = repository.getAllDrinks()
            drinks.postValue(result)
        }
        return drinks
    }

    fun getDrinkByName(name: String): DrinkDetails? {
        viewModelScope.launch {
            drinkDetails = repository.getDrinkByName(name)
        }
        return drinkDetails
    }
}
