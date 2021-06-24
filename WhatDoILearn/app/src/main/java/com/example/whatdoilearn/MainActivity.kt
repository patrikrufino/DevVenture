package com.example.whatdoilearn

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.whatdoilearn.databinding.ActivityMainBinding
import com.example.whatdoilearn.view.LearnedItemAdapter
import com.example.whatdoilearn.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recycler = binding.learnedItensRecyclerView
        val adapter = LearnedItemAdapter()
        recycler.adapter = adapter

        val items = viewModel.learnedItems

        items.observe(this, Observer {
            adapter.learnedItems = it
        })

        binding.floatAddNewLearnedItem.setOnClickListener {
            val intent = Intent(this, AddNewItem::class.java)
            startActivity(intent)
        }


    }
}