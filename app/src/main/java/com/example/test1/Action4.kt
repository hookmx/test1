package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Action44
import kotlinx.android.synthetic.main.activity_action3.*
import kotlinx.android.synthetic.main.activity_action4.*
import kotlinx.android.synthetic.main.activity_action44.*

class Action4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action4)

        backac4.setOnClickListener {
            startActivity(Intent(this, btnaction::class.java))

            nextac4.setOnClickListener {
                startActivity(Intent(this,Action44::class.java))
            }
        }
    }
}