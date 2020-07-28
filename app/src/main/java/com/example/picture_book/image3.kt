package com.example.picture_book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_image3.*

class image3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image3)

        button6.setOnClickListener {
            val intent = Intent(baseContext, image2::class.java)
        }

        button7.setOnClickListener {
            val intent = Intent(baseContext, image4::class.java)
        }
    }
}