package com.example.a5.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a5.R
import com.example.a5.adapter.Adapter
import com.example.a5.model.Members
import com.example.a5.model.SubMembers

class MainActivity : AppCompatActivity() {

    private lateinit var rv: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }
    private fun initView(){
        rv = findViewById(R.id.rv)
        rv.layoutManager = GridLayoutManager(this,1)
        val members: ArrayList<Members> = ArrayList<Members>()
        makeMember(members)
        rv.adapter = Adapter(this, members)
    }
    private fun makeMember(members: ArrayList<Members>) {
        for (i in 1..10) {
            members.add(Members(MemberLoad(i)))
        }
    }
    private fun MemberLoad(i: Int): ArrayList<SubMembers> {
        val members: ArrayList<SubMembers> = ArrayList()
        for (j in 1 .. 3) {
            if(i == 3 || i == 5 || i == 8){
                members.add(SubMembers(false))
            }else {
                members.add(SubMembers(true))
                break
            }
        }
        return members
    }
}