package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Action1
import com.example.test1.Action3
import kotlinx.android.synthetic.main.activity_action1.*
import kotlinx.android.synthetic.main.activity_action11.*
import kotlinx.android.synthetic.main.activity_action3.*
import kotlinx.android.synthetic.main.activity_action33.*

class Action33 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action33)

        backac33.setOnClickListener {
            startActivity(Intent(this, Action3::class.java))
        }
    }
}