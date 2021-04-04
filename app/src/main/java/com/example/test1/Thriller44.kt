package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Thriller1
import com.example.test1.Thriller4
import kotlinx.android.synthetic.main.activity_thriller1.*
import kotlinx.android.synthetic.main.activity_thriller11.*
import kotlinx.android.synthetic.main.activity_thriller4.*
import kotlinx.android.synthetic.main.activity_thriller44.*

class Thriller44 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thriller44)

        backthr44.setOnClickListener {
            startActivity(Intent(this,Thriller4::class.java))
        }
    }
}