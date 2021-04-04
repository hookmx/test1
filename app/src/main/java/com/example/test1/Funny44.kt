package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Funny1
import com.example.test1.Funny4
import kotlinx.android.synthetic.main.activity_funny1.*
import kotlinx.android.synthetic.main.activity_funny11.*
import kotlinx.android.synthetic.main.activity_funny4.*
import kotlinx.android.synthetic.main.activity_funny44.*

class Funny44 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_funny44)

        backfun44.setOnClickListener {
            startActivity(Intent(this, Funny4::class.java))
        }
    }
}