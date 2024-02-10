package com.cs4520.assignment1

import ProductViewHolder
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class ProductListAdapter : RecyclerView.Adapter<ProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_product_item, parent)
        return ViewHolder()
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    inner class productListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var itemImageView: ImageView
        var itemNameTextView : TextView
        var itemExpiryTextView : TextView
        var itemPriceTextView : TextView

        init {
            itemImageView = itemView.findViewById(R.id.itemImageView)
            itemNameTextView = itemView.findViewById(R.id.itemNameTextView)
            itemExpiryTextView = itemView.findViewById(R.id.itemExpiryTextView)
            itemPriceTextView = itemView.findViewById(R.id.itemPriceTextView)

        }

    }

}