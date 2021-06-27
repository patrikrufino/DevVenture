package com.example.todayscocktails.ui.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.todayscocktails.R
import com.example.todayscocktails.data.model.DrinkRemoteEntity

class DrinkAdapter : RecyclerView.Adapter<DrinkAdapter.MyViewHolder>() {
    var drinkList = listOf<DrinkRemoteEntity>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val drinkImage: ImageView = itemView.findViewById(R.id.drinkThumb)
        private val drinkTitle: TextView = itemView.findViewById(R.id.drinkTitle)

        fun bind(drink: DrinkRemoteEntity) {
            drinkTitle.text = drink.strDrink
            Glide.with(itemView.getContext()).load(drink.strDrinkThumb).into(drinkImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.activity_drink_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val drink = drinkList[position]
        holder.bind(drink)
    }

    override fun getItemCount(): Int {
        return drinkList.size
    }
}