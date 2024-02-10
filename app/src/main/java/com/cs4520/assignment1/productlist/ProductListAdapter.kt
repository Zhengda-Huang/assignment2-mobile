package com.cs4520.assignment1.productlist

import android.content.ClipData.Item
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.cs4520.assignment1.Product
import com.cs4520.assignment1.R

class ProductListAdapter(val productList: List<Product.item>) :
    RecyclerView.Adapter<ProductListAdapter.ProductListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.fragment_product_item, parent, false)
        return ProductListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ProductListViewHolder, position: Int) {
        val currentProduct: Product.item = productList[position]
        val drawableId =
            if (currentProduct.type == "Equipment") R.drawable.tools else R.drawable.vegetable

        val color = if (currentProduct.type == "Equipment") R.color.red else R.color.light_yellow
        val backgroundColor = ContextCompat.getColor(holder.itemView.context, color)

        holder.itemView.setBackgroundColor(backgroundColor)
        holder.itemImageView.setImageResource(drawableId)
        holder.itemNameTextView.text = currentProduct.name
        holder.itemExpiryTextView.text = currentProduct.expiryDate
        holder.itemPriceTextView.text = currentProduct.price.toString()

    }

    class ProductListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImageView = itemView.findViewById<ImageView>(R.id.itemImageView)
        var itemNameTextView = itemView.findViewById<TextView>(R.id.itemNameTextView)
        var itemExpiryTextView = itemView.findViewById<TextView>(R.id.itemExpiryTextView)
        var itemPriceTextView = itemView.findViewById<TextView>(R.id.itemPriceTextView)

    }

}