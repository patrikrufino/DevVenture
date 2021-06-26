package com.example.todayscocktails.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.todayscocktails.R

class DrinkItemAdapter: ReciclerView.Adapter<DrinkItemAdapter.DrinkItemViewHolder>() {
    var drinkItems = listOf<drinkItem>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LearnedItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.activity_drink_item, parent, false)

        return LearnedItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: LearnedItemViewHolder, position: Int) {
        /*holder sabe qual layout vai trabalhar*/
        val drinkItem = drinkItems[position]
        holder.bind(drinkItem)
    }

    override fun getItemCount(): Int {
        return drinkItems.size /*Conta quantos itens renderizados*/
    }

    inner class LearnedItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        /*Pega as refecencias de um layout manipula os elementos*/
        private val drinkTitle: TextView = itemView.findViewById(R.id.drinkTitle)
        private val drinkThumb: TextView = itemView.findViewById(R.id.drinkThumb)
        private val buttonGetDrink = itemView.findViewById(R.id.buttonGetDrink) as View

    }

}