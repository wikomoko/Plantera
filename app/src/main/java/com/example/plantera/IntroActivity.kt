package com.example.plantera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.plantera.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity() {

    //variable for data biding feature
    private lateinit var binding:ActivityIntroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //display the xml
        binding = DataBindingUtil.setContentView(this,R.layout.activity_intro)

        //hidding splash screen
        supportActionBar?.hide()

        //find button
        val btn_started=findViewById<Button>(R.id.btn_started)

        //button action
        btn_started.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}