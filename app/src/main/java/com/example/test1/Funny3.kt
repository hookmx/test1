package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_btnfunny.*
import kotlinx.android.synthetic.main.activity_funny3.*
import kotlinx.android.synthetic.main.activity_funny33.*

class Funny3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_funny3)

        backfun3.setOnClickListener {
            startActivity(Intent(this, btnfunny::class.java))

            nextfun3.setOnClickListener {
                startActivity(Intent(this,Funny33::class.java))
            }
        }
    }
}
