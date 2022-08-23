package com.salem.akhtar_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class CustomAdapter(private val Athkar:ArrayList<athkar>) : RecyclerView.Adapter<CustomAdapter.myviewholder>(){
    class myviewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image_view = itemView.imgview!!
        val text_view = itemView.txrview!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myviewholder {
        val listViewItem = LayoutInflater.from(parent.context).inflate(R.layout.list_item , parent , false)
        return myviewholder(listViewItem)
    }

    override fun onBindViewHolder(holder: myviewholder, position: Int) {
        val ath = Athkar[position]
        holder.image_view.setImageResource(ath.image)
        holder.text_view.text = ath.text
    }

    override fun getItemCount(): Int {
        return  Athkar.size
    }
}