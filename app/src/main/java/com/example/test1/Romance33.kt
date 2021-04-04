package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Romance1
import com.example.test1.Romance3
import kotlinx.android.synthetic.main.activity_romance1.*
import kotlinx.android.synthetic.main.activity_romance11.*
import kotlinx.android.synthetic.main.activity_romance3.*
import kotlinx.android.synthetic.main.activity_romance33.*

class Romance33 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_romance33)

        backro33.setOnClickListener {
            startActivity(Intent(this,Romance3::class.java))
        }
    }
}
