package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Thriller1
import com.example.test1.Thriller2
import kotlinx.android.synthetic.main.activity_thriller1.*
import kotlinx.android.synthetic.main.activity_thriller11.*
import kotlinx.android.synthetic.main.activity_thriller2.*
import kotlinx.android.synthetic.main.activity_thriller22.*

class Thriller22 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thriller22)

        backthr22.setOnClickListener {
            startActivity(Intent(this,Thriller2::class.java))
        }
    }
}