package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Fantasy22
import com.example.test1.Fantasy44
import kotlinx.android.synthetic.main.activity_fantasy2.*
import kotlinx.android.synthetic.main.activity_fantasy22.*
import kotlinx.android.synthetic.main.activity_fantasy4.*
import kotlinx.android.synthetic.main.activity_fantasy44.*

class Fantasy4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fantasy4)

        backfan4.setOnClickListener {
            startActivity(Intent(this, btnfantasy::class.java))

            nextfan4.setOnClickListener {
                startActivity(Intent(this,Fantasy44::class.java))
            }
        }
    }
}