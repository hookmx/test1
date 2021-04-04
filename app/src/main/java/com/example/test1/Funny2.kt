package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Funny22
import com.example.test1.Funny33
import com.example.test1.btnfunny
import kotlinx.android.synthetic.main.activity_btnfunny.*
import kotlinx.android.synthetic.main.activity_funny2.*
import kotlinx.android.synthetic.main.activity_funny22.*
import kotlinx.android.synthetic.main.activity_funny3.*
import kotlinx.android.synthetic.main.activity_funny33.*

class Funny2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_funny2)

        backfun2.setOnClickListener {
            startActivity(Intent(this, btnfunny::class.java))

            nextfun2.setOnClickListener {
                startActivity(Intent(this,Funny22::class.java))
            }
        }
    }
}