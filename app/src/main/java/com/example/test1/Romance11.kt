package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Mysterious1
import kotlinx.android.synthetic.main.activity_mysterious1.*
import kotlinx.android.synthetic.main.activity_mysterious11.*
import kotlinx.android.synthetic.main.activity_romance1.*
import kotlinx.android.synthetic.main.activity_romance11.*

class Romance11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_romance11)

        backro11.setOnClickListener {
            startActivity(Intent(this,Romance1::class.java))
        }
    }
}
