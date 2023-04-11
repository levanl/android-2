package com.example.waterdelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton

class SignUpActivity : AppCompatActivity() {

    private lateinit var logInButton: AppCompatButton
    private lateinit var backButton: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        backButton = findViewById(R.id.backButton)
        logInButton = findViewById(R.id.logInButton)
        loginListeners()
        backListeners()
    }


    private fun backListeners() {
        backButton.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
    private fun loginListeners() {
        logInButton.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

}
