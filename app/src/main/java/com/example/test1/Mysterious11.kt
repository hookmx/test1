package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mysterious1.*
import kotlinx.android.synthetic.main.activity_mysterious11.*

class Mysterious11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mysterious11)

        backmys11.setOnClickListener {
            startActivity(Intent(this,Mysterious1::class.java))
        }
    }
}
