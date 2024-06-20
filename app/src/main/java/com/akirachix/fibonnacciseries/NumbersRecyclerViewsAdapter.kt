package com.akirachix.fibonnacciseries

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class NumbersRecyclerViewsAdapter(var numberList:List<Int>):
RecyclerView.Adapter<NumbersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        val itemView =LayoutInflater.from(parent.context)
            .inflate(R.layout.number_list_item,parent,false)
        return NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvName.text= numberList[position].toString()
    }

    override fun getItemCount(): Int {
        return numberList.size
    }
}

class NumbersViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
}

