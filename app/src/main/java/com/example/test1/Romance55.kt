package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Romance1
import com.example.test1.Romance5
import kotlinx.android.synthetic.main.activity_romance1.*
import kotlinx.android.synthetic.main.activity_romance11.*
import kotlinx.android.synthetic.main.activity_romance5.*
import kotlinx.android.synthetic.main.activity_romance55.*

class Romance55 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_romance55)

        backro55.setOnClickListener {
            startActivity(Intent(this,Romance5::class.java))
        }
    }
}
