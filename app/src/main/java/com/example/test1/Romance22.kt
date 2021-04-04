package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Romance1
import com.example.test1.Romance2
import kotlinx.android.synthetic.main.activity_romance1.*
import kotlinx.android.synthetic.main.activity_romance11.*
import kotlinx.android.synthetic.main.activity_romance2.*
import kotlinx.android.synthetic.main.activity_romance22.*

class Romance22 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_romance22)

        backro22.setOnClickListener {
            startActivity(Intent(this,Romance2::class.java))
        }
    }
}
