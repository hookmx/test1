package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Romance1
import com.example.test1.Romance6
import kotlinx.android.synthetic.main.activity_romance1.*
import kotlinx.android.synthetic.main.activity_romance11.*
import kotlinx.android.synthetic.main.activity_romance6.*
import kotlinx.android.synthetic.main.activity_romance66.*

class Romance66 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_romance66)

        backro66.setOnClickListener {
            startActivity(Intent(this,Romance6::class.java))
        }
    }
}
