package com.example.plantera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        //hidding action bar
        supportActionBar?.hide()

        //handler for auto move to another activity using second delay time
        Handler().postDelayed({
            //move activity
           val intent= Intent(this,IntroActivity::class.java)
           startActivity(intent)

            //finish activity
            finish()

        },2000)


    }
}