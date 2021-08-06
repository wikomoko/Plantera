package com.example.plantera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
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


    //function for responding virtual back button
    override fun onSupportNavigateUp(): Boolean {

        //back to last page
        onBackPressed()
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.btn_menu_about -> {
                val intent = Intent(this,AboutUsActivity::class.java)
                startActivity(intent)
                finish()
                true
            }
            R.id.btn_menu_exit -> {
                finishAffinity()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}