package com.example.todayscocktails.ui.view

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.todayscocktails.R
import com.example.todayscocktails.data.model.DrinkRemoteEntity

class DrinkAdapter (): RecyclerView.Adapter<DrinkAdapter.MyViewHolder>() {
    var drinkList = listOf<DrinkRemoteEntity>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    var drinkDetails = listOf<DrinkRemoteEntity>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val drinkImage: ImageView = itemView.findViewById(R.id.drinkThumb)
        private val drinkTitle: TextView = itemView.findViewById(R.id.drinkTitle)

        fun bind(drink: DrinkRemoteEntity) {
            drinkTitle.text = drink.strDrink
            Glide.with(itemView.context).load(drink.strDrinkThumb).into(drinkImage)

            itemView.setOnClickListener {

                // 1. consultar o item pelo nome
                // 2. fazer uma string com os dados que quer compartilhar
                // 3. criar uma intent pra compartilhar o conteúdo


//                var ingredients = """${drinkDetails.strIngredient1},
//               ${drinkDetails.strIngredient2},
//                   ${drinkDetails.strIngredient3},
//                   ${drinkDetails.strIngredient4},
//                   ${drinkDetails.strIngredient5},
//                   ${drinkDetails.strIngredient6}"""
                //chamar a intent de compartilhamento


                val sendIntent: Intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, "ingredients")
                    type = "text/plain"
                }
                itemView.context.startActivity(sendIntent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.activity_drink_item, parent, false)
        view.setOnClickListener{
            //busca pelo nome




        }
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
