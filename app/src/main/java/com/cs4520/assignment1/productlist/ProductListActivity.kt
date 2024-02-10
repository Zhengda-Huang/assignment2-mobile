package com.cs4520.assignment1.productlist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cs4520.assignment1.Product
import com.cs4520.assignment1.R
import com.cs4520.assignment1.productsDataset

class ProductListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productlist)


        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val productList: List<Product.item> = productsDataset.map { item ->
            Product.item(item[0] as String, item[1] as String, item[2] as String?, item[3] as Int)
        }
        val adapter = ProductListAdapter(productList)
        recyclerView.adapter = adapter
    }
}