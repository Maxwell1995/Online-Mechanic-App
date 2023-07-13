package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth




class RegisterActivity: AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        // Initialize Firebase Auth
        firebaseAuth = FirebaseAuth.getInstance()

        val tvLogin: TextView = findViewById(R.id.tvLog_in)

        tvLogin.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }

             val btnReg: Button = findViewById(R.id.btnReg)
             btnReg.setOnClickListener {
                 performSignUp()
             }

        //get user details


    }

    private fun performSignUp() {
        val name = findViewById<EditText>(R.id.edtName)
        val email = findViewById<EditText>(R.id.edtEmail)
        val password = findViewById<EditText>(R.id.edtPassword)


        //null check
        if (name.text.isEmpty() || email.text.isEmpty() || password.text.isEmpty()) {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            return
        }


        //convert inputs to string

        val inputEmail = email.text.toString()
        val inputPassword = password.text.toString()

        //create user
        firebaseAuth.createUserWithEmailAndPassword(inputEmail, inputPassword)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, lets move to login activity

                    val intent = Intent(this,LoginActivity::class.java)
                    startActivity(intent)

                    Toast.makeText(baseContext, "Success.",
                        Toast.LENGTH_SHORT).show()

                } else {
                    // If sign in fails, display a message to the user.
                    Toast.makeText(baseContext, "Authentication failed.",
                        Toast.LENGTH_SHORT).show()
                }
            }
            .addOnFailureListener {
                Toast.makeText(baseContext, "Error occurred ${it.localizedMessage}",Toast.LENGTH_SHORT).show()
            }



    }


}






