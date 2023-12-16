package com.androidfactory.empty_views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val inputEditText: EditText = findViewById(R.id.inputEditText)
        val button: Button = findViewById(R.id.bottomButton)
        button.setOnClickListener{
            val input = inputEditText.text.toString()

            Log.i("LOG", input)
        }

    }
}