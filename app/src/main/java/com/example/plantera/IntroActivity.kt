package com.example.plantera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        //hidding splash screen
        supportActionBar?.hide()
    }
}