package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Thriller1
import com.example.test1.Thriller3
import kotlinx.android.synthetic.main.activity_thriller1.*
import kotlinx.android.synthetic.main.activity_thriller11.*
import kotlinx.android.synthetic.main.activity_thriller3.*
import kotlinx.android.synthetic.main.activity_thriller33.*

class Thriller33 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thriller33)

        backthr33.setOnClickListener {
            startActivity(Intent(this,Thriller3::class.java))
        }
    }
}