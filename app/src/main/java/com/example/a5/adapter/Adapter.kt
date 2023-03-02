package com.example.a5.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a5.R
import com.example.a5.model.Members

class Adapter(private val context: Context, private val memberS: ArrayList<Members>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private fun init(holder: RV_ViewHolder, memberS: Members) {
        holder.recycler.layoutManager = LinearLayoutManager(context,RecyclerView.HORIZONTAL,false)
        holder.recycler.adapter = SubAdapter(memberS.members!!)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return RV_ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_recycler, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is RV_ViewHolder) init(holder, memberS[position])
    }

    override fun getItemCount(): Int {
        return memberS.size
    }
    class RV_ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var recycler: RecyclerView = view.findViewById(R.id.rv_item)
    }

}