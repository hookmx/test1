package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Fantasy22
import com.example.test1.Fantasy66
import kotlinx.android.synthetic.main.activity_fantasy2.*
import kotlinx.android.synthetic.main.activity_fantasy22.*
import kotlinx.android.synthetic.main.activity_fantasy6.*
import kotlinx.android.synthetic.main.activity_fantasy66.*

class Fantasy6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fantasy6)

        backfan6.setOnClickListener {
            startActivity(Intent(this, btnfantasy::class.java))

            nextfan6.setOnClickListener {
                startActivity(Intent(this,Fantasy66::class.java))
            }
        }
    }
}