package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Romance22
import com.example.test1.Romance33
import kotlinx.android.synthetic.main.activity_romance2.*
import kotlinx.android.synthetic.main.activity_romance22.*
import kotlinx.android.synthetic.main.activity_romance3.*
import kotlinx.android.synthetic.main.activity_romance33.*

class Romance3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_romance3)

        backro3.setOnClickListener {
            startActivity(Intent(this, btnromance::class.java))

            nextro3.setOnClickListener {
                startActivity(Intent(this,Romance33::class.java))
            }
        }
    }
}