package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Drama1
import com.example.test1.Drama6
import kotlinx.android.synthetic.main.activity_drama1.*
import kotlinx.android.synthetic.main.activity_drama11.*
import kotlinx.android.synthetic.main.activity_drama6.*
import kotlinx.android.synthetic.main.activity_drama66.*

class Drama66 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drama66)

        backdra66.setOnClickListener {
            startActivity(Intent(this,Drama6::class.java))
        }
    }
}