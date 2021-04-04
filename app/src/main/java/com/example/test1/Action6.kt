package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Action66
import kotlinx.android.synthetic.main.activity_action3.*
import kotlinx.android.synthetic.main.activity_action6.*
import kotlinx.android.synthetic.main.activity_action66.*

class Action6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action6)

        backac6.setOnClickListener {
            startActivity(Intent(this, btnaction::class.java))

            nextac6.setOnClickListener {
                startActivity(Intent(this,Action66::class.java))
            }
        }
    }
}