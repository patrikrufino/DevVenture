package com.devventure.whysortudo

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.devventure.whysortudo.databinding.FragmentThrowDicesBinding

class ThrowDicesFragment : Fragment() {
    private var binding: FragmentThrowDicesBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThrowDicesBinding.inflate(inflater, container, false)

        val dice01 = binding?.imgDice01
        val dice02 = binding?.imgDice02
        val btnPlay = binding?.btnJogar
        val welcome = binding?.textViewWelcome
        val shareButton = binding?.share

        welcome?.text = arguments?.getString("playerName")

        shareButton?.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, "You are a lucky!")
            intent.setPackage("com.whatsapp")
            intent.type = "text/plain"

            activity?.packageManager?.run {
                if (intent.resolveActivity(this) != null) {
                    startActivity(intent)
                } else {
                    Toast.makeText(context, "You don't have WhatsApp app", Toast.LENGTH_LONG).show()
                }
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

        btnPlay?.setOnClickListener {
            dice01?.setImageResource(dices.random())
            dice02?.setImageResource(dices.random())
        }

        return binding?.root
    }
}