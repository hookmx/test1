package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Fantasy22
import com.example.test1.Fantasy55
import kotlinx.android.synthetic.main.activity_fantasy2.*
import kotlinx.android.synthetic.main.activity_fantasy22.*
import kotlinx.android.synthetic.main.activity_fantasy5.*
import kotlinx.android.synthetic.main.activity_fantasy55.*

class Fantasy5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fantasy5)

        backfan5.setOnClickListener {
            startActivity(Intent(this, btnfantasy::class.java))

            nextfan5.setOnClickListener {
                startActivity(Intent(this,Fantasy55::class.java))
            }
        }
    }
}