package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.ArrayList

class RecyclerViewAdapter(private val dataList: ArrayList<DataClass>): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {



    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var image: ImageView
        var textTitle: TextView
        var textDes: TextView


        init {
            image = itemView.findViewById(R.id.itemImage)
            textTitle = itemView.findViewById(R.id.itemTitle)
            textDes = itemView.findViewById(R.id.itemDetails)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return ViewHolder(v)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = dataList[position]
        holder.image.setImageResource(currentItem.dataImage)
        holder.textTitle.text = currentItem.dataTitle
        holder.textDes.text = currentItem.dataDetails

        holder.itemView.setOnClickListener {v: View ->
            Toast.makeText(v.context, "clicked on item", Toast.LENGTH_SHORT).show()
        }
    }


    override fun getItemCount(): Int {
        return dataList.size
    }



}


