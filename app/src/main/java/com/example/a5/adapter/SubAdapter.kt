package com.example.a5.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a5.R
import com.example.a5.model.SubMembers

class SubAdapter internal constructor(var members: ArrayList<SubMembers>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val yes = 1
    private val no = 0

    override fun getItemViewType(position: Int): Int {
        return if (members[position].bool){
            yes
        } else {
            no
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if(viewType == yes){
            return AppViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_item_1, parent, false))
        }
        return AppViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_item_2, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is AppViewHolder){}
    }

    override fun getItemCount(): Int {
        return members.size
    }
    class AppViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

}