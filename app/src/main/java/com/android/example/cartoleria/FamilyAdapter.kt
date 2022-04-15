package com.android.example.cartoleria

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FamilyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val familyName: TextView

    init {
        familyName = view.findViewById(R.id.family_name)
    }
}

class FamilyAdapter (val families: List<Family>) : RecyclerView.Adapter<FamilyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FamilyViewHolder {
        val familyView =
            LayoutInflater.from(parent.context).inflate(R.layout.familylistitem, parent, false)
        return FamilyViewHolder(familyView)
    }

    override fun onBindViewHolder(holder: FamilyViewHolder, position: Int) {
        holder.familyName.text = families[position].name
    }

    override fun getItemCount(): Int {
        return families.size
    }
}