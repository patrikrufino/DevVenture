package com.devventure.whysortudo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dice01 = findViewById<ImageView>(R.id.img_dice01)
        val dice02 = findViewById<ImageView>(R.id.img_dice02)
        val btnPlay = findViewById<Button>(R.id.btn_jogar)
        val welcome = findViewById<TextView>(R.id.textView_welcome)
        val shareButton = findViewById<FloatingActionButton>(R.id.share)

        val player = intent.getStringExtra("Player Name")

        val message = getString(R.string.welcome, player)


        welcome.text = message

        shareButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, "You are a lucky!")
            intent.type = "text/plain"
            intent.setPackage("com.whatsapp")
            startActivity(intent)

            if(intent.resolveActivity(this.packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(this, "You don't have WhatsApp app", Toast.LENGTH_LONG).show()

//                val launchIntent = packageManager.getLaunchIntentForPackage("com.android.vending")
//                val comp = ComponentName(
//                    "com.android.vending",
//                    "com.google.android.finsky.activities.LaunchUrlHandlerActivity"
//                )
//                launchIntent!!.component = comp
//
//                launchIntent!!.data = Uri.parse("market://details?id=com.whatsapp")
//                startActivity(launchIntent)
            }
        }

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

        Log.i("CICLO DE VIDA", "ON CREATE")
    }

    override fun onStart() {
        super.onStart()
        Log.i("CICLO DE VIDA", "ON START")
    }

    override fun onResume() {
        super.onResume()
        Log.i("CICLO DE VIDA", "ON RESUME")
    }

    override fun onPause() {
        super.onPause()
        Log.i("CICLO DE VIDA", "ON PAUSE")
    }

    override fun onStop() {
        super.onStop()
        Log.i("CICLO DE VIDA", "ON STOP")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("CICLO DE VIDA", "ON DESTROY")
    }
}