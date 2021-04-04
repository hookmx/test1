package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Action55
import kotlinx.android.synthetic.main.activity_action3.*
import kotlinx.android.synthetic.main.activity_action5.*
import kotlinx.android.synthetic.main.activity_action55.*

class Action5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action5)

        backac5.setOnClickListener {
            startActivity(Intent(this, btnaction::class.java))

            nextac5.setOnClickListener {
                startActivity(Intent(this,Action55::class.java))
            }
        }
    }
}