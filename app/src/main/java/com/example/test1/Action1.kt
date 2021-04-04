package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Action11
import kotlinx.android.synthetic.main.activity_action1.*
import kotlinx.android.synthetic.main.activity_action11.*

class Action1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action1)

        backac1.setOnClickListener {
            startActivity(Intent(this, btnaction::class.java))

            nextac1.setOnClickListener {
                startActivity(Intent(this, Action11::class.java))
            }
        }
    }
}