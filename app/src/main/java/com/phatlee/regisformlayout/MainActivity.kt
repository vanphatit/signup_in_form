package com.phatlee.regisformlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loginIntent = Intent(this, Login::class.java)
        val isOpened: Int = intent.getIntExtra("isOpened", 0)
        if(isOpened == 0){
            startActivity(loginIntent)
        }

    }

}
