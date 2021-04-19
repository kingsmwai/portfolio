package com.example.fredportfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.ButtonBarLayout

class Contact_Us : AppCompatActivity() {
    lateinit var btnClick: ButtonBarLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact__us)
        btnClick = findViewById(R.id.btnClick)
        btnClick.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"fred fred",Toast.LENGTH_LONG).show()
        })

    }
}