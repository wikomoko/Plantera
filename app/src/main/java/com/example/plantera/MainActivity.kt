package com.example.plantera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    //variable for recycler view
    private lateinit var rv_product:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //hidding action bar by Code
        supportActionBar?.hide()

        //getting data from ProductData.kt
        val getAllData = ProductData()
        val image_data = getAllData.image_of_products
        val title_data = getAllData.name_of_products
        val desc_data = getAllData.desc_of_products

        //finding recycler view
        rv_product=findViewById(R.id.rv_product)

        //set Layout
        rv_product.layoutManager = GridLayoutManager(this,2)

        //inserting data to adapter
        rv_product.adapter = CardViewAdapter(image_data,title_data,desc_data)
    }
}