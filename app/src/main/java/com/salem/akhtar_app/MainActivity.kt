package com.salem.akhtar_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myrecycler.layoutManager = LinearLayoutManager(this , RecyclerView.VERTICAL , false)
        val myAdapter =  CustomAdapter(athkarList)
        myrecycler.adapter = myAdapter
    }
}