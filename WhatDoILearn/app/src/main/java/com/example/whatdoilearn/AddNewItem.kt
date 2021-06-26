package com.example.whatdoilearn

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import com.example.whatdoilearn.entities.LearnedItem
import androidx.appcompat.app.AppCompatActivity
import com.example.whatdoilearn.databinding.ActivityAddNewItemBinding
import com.example.whatdoilearn.entities.UnderstandingLevel
import com.example.whatdoilearn.viewmodel.AddNewItemModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class AddNewItem : AppCompatActivity() {
    private lateinit var binding: ActivityAddNewItemBinding
    private val viewModel: AddNewItemModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNewItemBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "New Learned Item"



        binding.buttonAdd.setOnClickListener {
            saveNewItem()
            gotMainActivity()
        }
    }

    private fun saveNewItem() {
        val title = binding.titleNewItem.text.toString()
        val description = binding.descriptionNewItem.text.toString()

        val radioButtonTag =
            findViewById<RadioButton>(binding.priorityRadioGroup.checkedRadioButtonId).tag.toString()

        val level =
            UnderstandingLevel.valueOf(radioButtonTag.uppercase())

        val newItem =
            LearnedItem(name = title, description = description, understandingLevel = level)
        viewModel.insert(newItem)
    }

    private fun gotMainActivity(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}