package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Thriller1
import com.example.test1.Thriller33
import com.example.test1.btnthriller
import kotlinx.android.synthetic.main.activity_btnthriller.*
import kotlinx.android.synthetic.main.activity_thriller1.*
import kotlinx.android.synthetic.main.activity_thriller3.*
import kotlinx.android.synthetic.main.activity_thriller33.*

class Thriller3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thriller3)

        backthr3.setOnClickListener {
            startActivity(Intent(this, btnthriller::class.java))

            nextthr3.setOnClickListener {
                startActivity(Intent(this,Thriller33::class.java))
            }
        }
    }
}