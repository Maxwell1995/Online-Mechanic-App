package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth





class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Initialize Firebase Auth

        firebaseAuth = FirebaseAuth.getInstance()
        binding.mtvRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))

        }


        binding.btnLog.setOnClickListener {
            val edtEmail = binding.edtEmail.text.toString()
            val edtPassword = binding.edtPassword.text.toString()

            //log in user
            if (edtEmail.isnotEmpty() && edtPassword.isnotEmpty()) {

                firebaseAuth.signInWithEmailAndPassword(edtEmail, edtPassword)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            //sign in success. navigate to main activity2
                            val intent = Intent(this, MainActivity2::class.java)
                            startActivity(intent)
                            Toast.makeText(
                                baseContext, "Success.",
                                Toast.LENGTH_SHORT
                            ).show()
                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(
                                baseContext, "Authentication failed.",
                                Toast.LENGTH_SHORT
                            ).show()
                        }

                    }
                    .addOnFailureListener {
                        Toast.makeText(
                            baseContext,
                            "Error occurred ${it.localizedMessage}",
                            Toast.LENGTH_SHORT
                        ).show()

                    }
            }


        }

    }
}

private fun String.isnotEmpty(): Boolean {
return true
}



