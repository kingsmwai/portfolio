package com.example.fredportfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class home : AppCompatActivity() {
    lateinit var click: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        click = findViewById(R.id.clickbtn)
        click.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"Clicked", Toast.LENGTH_LONG).show()
        })

    }
}