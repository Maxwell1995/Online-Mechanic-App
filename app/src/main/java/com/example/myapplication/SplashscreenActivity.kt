package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashscreenActivity : AppCompatActivity() {

   private val SPLASH_TIME: Long = 6000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        Handler().postDelayed({
            startActivity(Intent (this, RegisterActivity::class.java))
            finish()
        },SPLASH_TIME)
    }
}