package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Action22
import kotlinx.android.synthetic.main.activity_action2.*
import kotlinx.android.synthetic.main.activity_action22.*

class Action2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action2)

        backac2.setOnClickListener {
            startActivity(Intent(this, btnaction::class.java))

            nextac2.setOnClickListener {
                startActivity(Intent(this,Action22::class.java))
            }
        }
    }
}

