package com.devventure.whysortudo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dice01 = findViewById<ImageView>(R.id.img_dice01) as ImageView
        val dice02 = findViewById<ImageView>(R.id.img_dice02) as ImageView
        val btnPlay = findViewById<TextView>(R.id.btn_jogar) as Button

        // List of dices
        val dices = listOf(
            R.drawable.dice_1,
            R.drawable.dice_2,
            R.drawable.dice_3,
            R.drawable.dice_4,
            R.drawable.dice_5,
            R.drawable.dice_6,
        )

        btnPlay.setOnClickListener {
            dice01.setImageResource(dices.random())
            dice02.setImageResource(dices.random())
        }
    }

}