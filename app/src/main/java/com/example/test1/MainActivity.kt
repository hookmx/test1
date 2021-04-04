package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_search.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FicCate1.setOnClickListener {
            startActivity(Intent(this,FictionCate::class.java))

            bnsearch.setOnClickListener {
                startActivity(Intent(this,search::class.java))
            }
        }
    }
}

