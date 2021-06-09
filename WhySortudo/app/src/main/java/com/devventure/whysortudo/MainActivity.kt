package com.devventure.whysortudo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dado01 = findViewById<TextView>(R.id.txt_dado01) as TextView
        val dado02 = findViewById<TextView>(R.id.txt_dado02) as TextView
        val btnPlay = findViewById<TextView>(R.id.btn_jogar) as Button

        btnPlay.setOnClickListener() {
            dado01.text = getNumberRandom().toString()
            dado02.text = getNumberRandom().toString()
        }
    }

    private fun getNumberRandom(): Int {
        return (1..6).random()
    }
}