package com.android.example.cartoleria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val families = listOf(Family("Pen"), Family("Pencil"), Family("Rubber"), Family("Color"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = findViewById<RecyclerView>(R.id.family_list)
        val adapter = FamilyAdapter(families)
        list.adapter = adapter
        list.layoutManager = LinearLayoutManager(this)
    }
}