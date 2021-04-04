package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Romance11
import com.example.test1.Romance22
import kotlinx.android.synthetic.main.activity_romance1.*
import kotlinx.android.synthetic.main.activity_romance11.*
import kotlinx.android.synthetic.main.activity_romance2.*
import kotlinx.android.synthetic.main.activity_romance22.*

class Romance2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_romance2)

        backro2.setOnClickListener {
            startActivity(Intent(this, btnromance::class.java))

            nextro2.setOnClickListener {
                startActivity(Intent(this,Romance22::class.java))
            }
        }
    }
}