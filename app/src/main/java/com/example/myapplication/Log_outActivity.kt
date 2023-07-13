package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth

class Log_outActivity : AppCompatActivity() {
    lateinit var btnlogout: Button
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_out)
        firebaseAuth = FirebaseAuth.getInstance()

        btnlogout = findViewById(R.id.btnLogout)

        btnlogout.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)


        }
    }
}