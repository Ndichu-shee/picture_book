package com.example.picture_book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_image2.*
import kotlinx.android.synthetic.main.activity_main.*

class image2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image2)


        btThree.setOnClickListener {
            val intent = Intent(baseContext, MainActivity::class.java)
        }

        btTwo.setOnClickListener {
            val intent = Intent(baseContext,image3 ::class.java)
        }



    }
}