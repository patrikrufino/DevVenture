package com.example.todayscocktails

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.todayscocktails.ui.MainActivity

class SplashScreen : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        handler = Handler()
        handler.postDelayed({
            val novaTela = Intent(this, MainActivity::class.java)
            startActivity(novaTela)
            finish()
        }, 2500)
    }
}