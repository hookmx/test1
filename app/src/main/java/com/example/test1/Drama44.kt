package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Drama1
import com.example.test1.Drama4
import kotlinx.android.synthetic.main.activity_drama1.*
import kotlinx.android.synthetic.main.activity_drama11.*
import kotlinx.android.synthetic.main.activity_drama4.*
import kotlinx.android.synthetic.main.activity_drama44.*

class Drama44 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drama44)

        backdra44.setOnClickListener {
            startActivity(Intent(this,Drama4::class.java))
        }
    }
}