package com.phatlee.regisformlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        setupButton()
    }

    private fun setupButton() {
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {

            val edtEmail = findViewById<EditText>(R.id.edtEmail)
            val edtPassword = findViewById<EditText>(R.id.edtPassword)

            val email = edtEmail.text.toString()
            val password = edtPassword.text.toString()

            if(!email.isNullOrEmpty() && email == "vanphatit" && !password.isNullOrEmpty() && password == "1234"){
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("isOpened", 1)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Email or password incorrect!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}