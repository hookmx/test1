package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Drama1
import com.example.test1.Drama3
import kotlinx.android.synthetic.main.activity_drama1.*
import kotlinx.android.synthetic.main.activity_drama11.*
import kotlinx.android.synthetic.main.activity_drama3.*
import kotlinx.android.synthetic.main.activity_drama33.*

class Drama33 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drama33)

        backdra33.setOnClickListener {
            startActivity(Intent(this,Drama3::class.java))
        }
    }
}