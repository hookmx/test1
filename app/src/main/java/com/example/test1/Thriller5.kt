package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Thriller11
import com.example.test1.Thriller55
import com.example.test1.btnthriller
import kotlinx.android.synthetic.main.activity_btnthriller.*
import kotlinx.android.synthetic.main.activity_thriller1.*
import kotlinx.android.synthetic.main.activity_thriller11.*
import kotlinx.android.synthetic.main.activity_thriller5.*
import kotlinx.android.synthetic.main.activity_thriller55.*

class Thriller5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thriller5)


        backthr5.setOnClickListener {
            startActivity(Intent(this, btnthriller::class.java))

            nextthr5.setOnClickListener {
                startActivity(Intent(this,Thriller55::class.java))
            }
        }
    }
}