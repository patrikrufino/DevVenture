package com.example.todayscocktails.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.androidx.viewmodel.ext.android.viewModel
import androidx.lifecycle.Observer
import com.example.todayscocktails.data.model.DrinkRemoteEntity
import com.example.todayscocktails.databinding.ActivityMainBinding
import com.example.todayscocktails.viewmodel.DrinkViewModel
import com.example.todayscocktails.ui.view.DrinkAdapter

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding
        get() = _binding!!

    private val viewModel: DrinkViewModel by viewModel()
    private lateinit var mAdapter: DrinkAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        subscribeObservers()
        initRecyclerView()
    }

    private fun subscribeObservers() {
        viewModel.getDrinks().observe(this@MainActivity, Observer {
            mAdapter.drinkList = it
        })
    }

    private fun initRecyclerView() {
        mAdapter = DrinkAdapter()
        binding.learnedItensRecyclerView.apply {
            adapter = mAdapter
        }
    }
}