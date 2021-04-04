package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Fantasy22
import com.example.test1.Fantasy33
import kotlinx.android.synthetic.main.activity_fantasy2.*
import kotlinx.android.synthetic.main.activity_fantasy22.*
import kotlinx.android.synthetic.main.activity_fantasy3.*
import kotlinx.android.synthetic.main.activity_fantasy33.*

class Fantasy3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fantasy3)

        backfan3.setOnClickListener {
            startActivity(Intent(this, btnfantasy::class.java))

            nextfan3.setOnClickListener {
                startActivity(Intent(this,Fantasy33::class.java))
            }
        }
    }
}