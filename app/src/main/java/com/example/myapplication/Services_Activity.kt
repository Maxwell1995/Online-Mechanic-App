package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.databinding.ActivityLoginBinding
import com.example.myapplication.databinding.ActivityServicesBinding

class ServicesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityServicesBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityServicesBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnClick.setOnClickListener {
            startActivity(Intent(this, BookingActivity::class.java))

        }


    }
}

