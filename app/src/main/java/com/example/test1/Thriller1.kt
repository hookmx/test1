package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Mysterious11
import com.example.test1.Thriller11
import com.example.test1.btnmysterious
import com.example.test1.btnthriller
import kotlinx.android.synthetic.main.activity_btnmysterious.*
import kotlinx.android.synthetic.main.activity_btnthriller.*
import kotlinx.android.synthetic.main.activity_mysterious1.*
import kotlinx.android.synthetic.main.activity_mysterious11.*
import kotlinx.android.synthetic.main.activity_thriller1.*
import kotlinx.android.synthetic.main.activity_thriller11.*

class Thriller1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thriller1)

        backthr1.setOnClickListener {
            startActivity(Intent(this, btnthriller::class.java))

            nextthr1.setOnClickListener {
                startActivity(Intent(this,Thriller11::class.java))
            }
        }
    }
}