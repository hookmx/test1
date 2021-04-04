package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Romance22
import com.example.test1.Romance66
import kotlinx.android.synthetic.main.activity_romance2.*
import kotlinx.android.synthetic.main.activity_romance22.*
import kotlinx.android.synthetic.main.activity_romance6.*
import kotlinx.android.synthetic.main.activity_romance66.*

class Romance6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_romance6)

        backro6.setOnClickListener {
            startActivity(Intent(this, btnromance::class.java))

            nextro6.setOnClickListener {
                startActivity(Intent(this,Romance66::class.java))
            }
        }
    }
}