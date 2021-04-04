package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Thriller11
import com.example.test1.Thriller66
import com.example.test1.btnthriller
import kotlinx.android.synthetic.main.activity_btnthriller.*
import kotlinx.android.synthetic.main.activity_thriller1.*
import kotlinx.android.synthetic.main.activity_thriller11.*
import kotlinx.android.synthetic.main.activity_thriller6.*
import kotlinx.android.synthetic.main.activity_thriller66.*

class Thriller6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thriller6)

        backthr6.setOnClickListener {
            startActivity(Intent(this, btnthriller::class.java))

            nextthr6.setOnClickListener {
                startActivity(Intent(this,Thriller66::class.java))
            }
        }
    }
}