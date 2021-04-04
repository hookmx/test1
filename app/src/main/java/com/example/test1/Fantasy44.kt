package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Fantasy4
import com.example.test1.Fantasy6
import kotlinx.android.synthetic.main.activity_fantasy4.*
import kotlinx.android.synthetic.main.activity_fantasy44.*
import kotlinx.android.synthetic.main.activity_fantasy6.*
import kotlinx.android.synthetic.main.activity_fantasy66.*

class Fantasy44 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fantasy44)

        backfan44.setOnClickListener {
            startActivity(Intent(this,Fantasy4::class.java))
        }
    }
}
