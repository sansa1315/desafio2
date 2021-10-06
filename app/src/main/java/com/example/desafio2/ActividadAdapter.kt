package com.example.desafio2

import android.content.Intent
import androidx.recyclerview.widget.RecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

//import androidx.recyclerview.widget.RecyclerView

class ActivityAdapter(private val data: List<String>) : RecyclerView.Adapter<ActivityAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater.inflate(R.layout.una_actividad, parent, false))
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.render(data[position])
//        val intent = Intent(this, activities::class.java)
//        startActivity(intent)
//        holder.itemView.setOnClickListener{
//            Toast.makeText(holder.itemView.context, data[position], Toast.LENGTH_SHORT).show()
//        }

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return data.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun render(actividad: String) {
            with(view){
                view.findViewById<TextView>(R.id.textView3).text = actividad
            }
        }

    }
}
