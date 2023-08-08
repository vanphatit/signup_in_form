package com.phatlee.regisformlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Registration : AppCompatActivity() {
    lateinit var user: User
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

    }

}