package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Romance22
import com.example.test1.Romance55
import kotlinx.android.synthetic.main.activity_romance2.*
import kotlinx.android.synthetic.main.activity_romance22.*
import kotlinx.android.synthetic.main.activity_romance5.*
import kotlinx.android.synthetic.main.activity_romance55.*

class Romance5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_romance5)

        backro5.setOnClickListener {
            startActivity(Intent(this, btnromance::class.java))

            nextro5.setOnClickListener {
                startActivity(Intent(this,Romance55::class.java))
            }
        }
    }
}