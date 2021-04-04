package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Funny1
import kotlinx.android.synthetic.main.activity_funny1.*
import kotlinx.android.synthetic.main.activity_funny11.*
import kotlinx.android.synthetic.main.activity_thriller1.*
import kotlinx.android.synthetic.main.activity_thriller11.*

class Thriller11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thriller11)

        backthr11.setOnClickListener {
            startActivity(Intent(this,Thriller1::class.java))
        }
    }
}
