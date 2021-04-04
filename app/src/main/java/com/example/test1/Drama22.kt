package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Drama1
import com.example.test1.Drama2
import kotlinx.android.synthetic.main.activity_drama1.*
import kotlinx.android.synthetic.main.activity_drama11.*
import kotlinx.android.synthetic.main.activity_drama2.*
import kotlinx.android.synthetic.main.activity_drama22.*

class Drama22 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drama22)

        backdra22.setOnClickListener {
            startActivity(Intent(this,Drama2::class.java))
        }
    }
}