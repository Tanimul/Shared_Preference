package com.example.sharedpreference

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var fullName: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fullName = findViewById<TextView>(R.id.fullName)

    }

    fun save(view: View) {
        Tools().setValue(KEYS.FULL_NAME, fullName.text.toString())
        Toast.makeText(this, "Your name is: ${Tools().getStringValue(KEYS.FULL_NAME,"FULL_NAME")}", Toast.LENGTH_SHORT).show()
    }
}