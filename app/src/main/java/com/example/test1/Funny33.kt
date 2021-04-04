package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Funny1
import com.example.test1.Funny3
import kotlinx.android.synthetic.main.activity_funny1.*
import kotlinx.android.synthetic.main.activity_funny11.*
import kotlinx.android.synthetic.main.activity_funny3.*
import kotlinx.android.synthetic.main.activity_funny33.*

class Funny33 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_funny33)

        backfun33.setOnClickListener {
            startActivity(Intent(this, Funny3::class.java))
        }
    }
}