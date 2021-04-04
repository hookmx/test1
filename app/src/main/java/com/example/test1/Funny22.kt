package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Funny1
import com.example.test1.Funny2
import kotlinx.android.synthetic.main.activity_funny1.*
import kotlinx.android.synthetic.main.activity_funny11.*
import kotlinx.android.synthetic.main.activity_funny2.*
import kotlinx.android.synthetic.main.activity_funny22.*

class Funny22 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_funny22)

        backfun22.setOnClickListener {
            startActivity(Intent(this, Funny2::class.java))
        }
    }
}