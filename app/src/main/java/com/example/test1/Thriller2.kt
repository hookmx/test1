package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Thriller1
import com.example.test1.Thriller22
import com.example.test1.btnthriller
import kotlinx.android.synthetic.main.activity_btnthriller.*
import kotlinx.android.synthetic.main.activity_thriller1.*
import kotlinx.android.synthetic.main.activity_thriller2.*
import kotlinx.android.synthetic.main.activity_thriller22.*

class Thriller2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thriller2)

        backthr2.setOnClickListener {
            startActivity(Intent(this, btnthriller::class.java))

            nextthr2.setOnClickListener {
                startActivity(Intent(this,Thriller22::class.java))
            }
        }
    }
}