package com.devventure.whysortudo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_user)

        val playerName = findViewById<EditText>(R.id.input_playerName)
        val getPlayerName = findViewById<Button>(R.id.btn_getPlayerName)


        getPlayerName.setOnClickListener {
            val player = playerName.text.toString()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("Player Name", player)
            startActivity(intent)
        }
    }
}