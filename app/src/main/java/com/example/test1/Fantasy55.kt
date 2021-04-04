package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Fantasy5
import com.example.test1.Fantasy6
import kotlinx.android.synthetic.main.activity_fantasy5.*
import kotlinx.android.synthetic.main.activity_fantasy55.*
import kotlinx.android.synthetic.main.activity_fantasy6.*
import kotlinx.android.synthetic.main.activity_fantasy66.*

class Fantasy55 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fantasy55)

        backfan55.setOnClickListener {
            startActivity(Intent(this,Fantasy5::class.java))
        }
    }
}
