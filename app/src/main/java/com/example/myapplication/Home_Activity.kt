package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val tvAbout: TextView = findViewById(R.id.tvAbout_us)
        tvAbout.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }


        val tvServices: TextView = findViewById(R.id.tvServices)
        tvServices.setOnClickListener {
            val intent = Intent(this, ServicesActivity::class.java)
            startActivity(intent)
        }


        val tvEvents: TextView = findViewById(R.id.tvEvents)
        tvEvents.setOnClickListener {
            val intent = Intent(this, EventsActivity::class.java)
            startActivity(intent)
        }


        val tvReviews: TextView = findViewById(R.id.tvReviews)
        tvReviews.setOnClickListener {
            val intent = Intent(this, ReviewsActivity::class.java)
            startActivity(intent)
        }

        val tvShare: TextView = findViewById(R.id.tvShare)
        tvShare.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }

    }

}




