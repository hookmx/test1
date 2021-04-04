package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Thriller1
import com.example.test1.Thriller6
import kotlinx.android.synthetic.main.activity_thriller1.*
import kotlinx.android.synthetic.main.activity_thriller11.*
import kotlinx.android.synthetic.main.activity_thriller6.*
import kotlinx.android.synthetic.main.activity_thriller66.*

class Thriller66 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thriller66)

        backthr66.setOnClickListener {
            startActivity(Intent(this,Thriller6::class.java))
        }
    }
}