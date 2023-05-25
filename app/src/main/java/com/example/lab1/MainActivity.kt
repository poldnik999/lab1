package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main_btn = findViewById(R.id.button)
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName)
        textView = findViewById(R.id.textView2)

        main_btn?.setOnClickListener{
            textView?.text = editTextTextPersonName?.text.toString()
        }
    }
    private var main_btn: Button? = null
    private var editTextTextPersonName: EditText? = null
    private var textView: TextView? = null
}