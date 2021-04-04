package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Drama1
import com.example.test1.Drama5
import kotlinx.android.synthetic.main.activity_drama1.*
import kotlinx.android.synthetic.main.activity_drama11.*
import kotlinx.android.synthetic.main.activity_drama5.*
import kotlinx.android.synthetic.main.activity_drama55.*

class Drama55 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drama55)

        backdra55.setOnClickListener {
            startActivity(Intent(this,Drama5::class.java))
        }
    }
}