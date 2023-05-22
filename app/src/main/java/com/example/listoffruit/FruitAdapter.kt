package com.example.listoffruit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FruitAdapter(private val fruits: List<String>) : RecyclerView.Adapter<FruitAdapter.FruitViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_fruit, parent, false)
        return FruitViewHolder(view)
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        val fruitName = fruits[position]
        holder.bind(fruitName)
    }

    override fun getItemCount(): Int {
        return fruits.size
    }

    inner class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val fruitTextView: TextView = itemView.findViewById(R.id.fruitTextView)

        fun bind(fruitName: String) {
            fruitTextView.text = fruitName
        }
    }
}
