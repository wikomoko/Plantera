package com.example.plantera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        //activatin virtual back button on action bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //make action bar text blank
        supportActionBar?.title=""

        //getting data from intent
        val image_reciever = intent.getIntExtra("images_packet",0)
        val title_reciever = intent.getStringExtra("name_packet")
        val dec_reciever = intent.getStringExtra("desc_packet")

        //getting components from view
        val image_detail = findViewById<ImageView>(R.id.detail_image)
        val title_detail = findViewById<TextView>(R.id.detail_title)
        val desc_detail = findViewById<TextView>(R.id.detail_desc)

        //inserting data to components
        image_detail.setImageResource(image_reciever)
        title_detail.text = title_reciever.toString()
        desc_detail.text  = dec_reciever.toString()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}