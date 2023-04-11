package com.example.waterdelivery

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton

class LoginActivity : AppCompatActivity() {

    private lateinit var backButton: ImageView
    private lateinit var signUpButton: AppCompatButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        backButton = findViewById(R.id.backButton)
        signUpButton = findViewById(R.id.signUpButton)
        backListeners()
        signUpListeners()
    }


    private fun backListeners() {
        backButton.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    private fun signUpListeners() {
        signUpButton.setOnClickListener{
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }

}