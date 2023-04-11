package com.example.waterdelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    private lateinit var signUpButton: AppCompatButton
    private lateinit var logInButton: AppCompatButton
    private lateinit var backButton: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        signUpButton = findViewById(R.id.signUpButton)
        logInButton = findViewById(R.id.logInButton)

        signUpListeners()
        loginListeners()
    }


    private fun signUpListeners() {
        signUpButton.setOnClickListener{
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
    private fun loginListeners() {
        logInButton.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }


}