package com.example.whatdoilearn

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.whatdoilearn.databinding.ActivityAddNewItemBinding

class AddNewItem : AppCompatActivity() {
    private lateinit var binding: ActivityAddNewItemBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNewItemBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "New Learned Item"


        binding.buttonAdd.setOnClickListener {
            gotMainActivity()
        }
    }

    private fun gotMainActivity(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}