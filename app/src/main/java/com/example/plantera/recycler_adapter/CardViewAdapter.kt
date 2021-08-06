package com.example.plantera.recycler_adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.plantera.DetailActivity
import com.example.plantera.R

class CardViewAdapter(val image_data: IntArray, val title_data: Array<String>, val desc_data: Array<String>) : RecyclerView.Adapter<CardViewAdapter.CardViewHolder>(){
    class CardViewHolder(item: View): RecyclerView.ViewHolder(item) {
        //getting position of product's image
        val images = item.findViewById<ImageView>(R.id.product_image)

        //getting position of product's name
        val name = item.findViewById<TextView>(R.id.product_title)

        //getting position of product's descriptions
        val desc = item.findViewById<TextView>(R.id.product_desc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.product_list,parent,false)
        return  CardViewHolder(v)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.images.setImageResource(image_data[position])
        holder.name.text = title_data[position]
        holder.desc.text = desc_data[position]

        holder.itemView.setOnClickListener {
           val intentWithData = Intent(holder.itemView.context,DetailActivity::class.java)
               .putExtra("images_packet",image_data[position])
               .putExtra("name_packet",title_data[position])
               .putExtra("desc_packet",desc_data[position])

            //sending and move to DetailActivity.kt
            holder.itemView.context.startActivity(intentWithData)

        }
    }

    override fun getItemCount(): Int {
        return image_data.size
    }
}