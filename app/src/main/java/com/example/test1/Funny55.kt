package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Funny1
import com.example.test1.Funny5
import kotlinx.android.synthetic.main.activity_funny1.*
import kotlinx.android.synthetic.main.activity_funny11.*
import kotlinx.android.synthetic.main.activity_funny5.*
import kotlinx.android.synthetic.main.activity_funny55.*

class Funny55 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_funny55)

        backfun55.setOnClickListener {
            startActivity(Intent(this,Funny5::class.java))
        }
    }
}