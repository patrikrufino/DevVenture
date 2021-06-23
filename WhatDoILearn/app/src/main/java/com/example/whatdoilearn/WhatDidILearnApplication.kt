package com.example.whatdoilearn

import android.app.Application
import com.example.whatdoilearn.data.LearnedItemRepository
import com.example.whatdoilearn.data.database.LearnItemDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

class WhatDidILearnApplication : Application() {
    val database by lazy { LearnItemDatabase.getDatabase(this, CoroutineScope(Dispatchers.IO)) }

    val repository by lazy {
        LearnedItemRepository(database.learnedItemDao())
    }
}