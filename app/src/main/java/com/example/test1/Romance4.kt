package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Romance22
import com.example.test1.Romance44
import kotlinx.android.synthetic.main.activity_romance2.*
import kotlinx.android.synthetic.main.activity_romance22.*
import kotlinx.android.synthetic.main.activity_romance4.*
import kotlinx.android.synthetic.main.activity_romance44.*

class Romance4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_romance4)

        backro4.setOnClickListener {
            startActivity(Intent(this, btnromance::class.java))

            nextro4.setOnClickListener {
                startActivity(Intent(this,Romance44::class.java))
            }
        }
    }
}