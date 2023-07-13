package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AboutActivity : AppCompatActivity() {

    lateinit var tvAboutActivity: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        var tvAboutActivity: TextView = findViewById(R.id.MtvAbout)
    }
}