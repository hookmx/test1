package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Action33
import kotlinx.android.synthetic.main.activity_action3.*
import kotlinx.android.synthetic.main.activity_action33.*

class Action3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action3)

        backac3.setOnClickListener {
            startActivity(Intent(this, btnaction::class.java))

            nextac3.setOnClickListener {
                startActivity(Intent(this,Action33::class.java))
            }
        }
    }
}

