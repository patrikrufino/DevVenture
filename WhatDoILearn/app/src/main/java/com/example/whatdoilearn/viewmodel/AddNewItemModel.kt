package com.example.whatdoilearn.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.whatdoilearn.data.LearnedItemRepository
import com.example.whatdoilearn.entities.LearnedItem
import kotlinx.coroutines.launch

class AddNewItemModel(private val repository: LearnedItemRepository) : ViewModel() {

    val showError = MutableLiveData<Boolean>()

    fun insert(item: LearnedItem) = viewModelScope.launch {
        repository.insert(item)
    }
}
