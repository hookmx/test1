package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Funny11
import com.example.test1.Funny33
import com.example.test1.btnfunny
import kotlinx.android.synthetic.main.activity_btnfunny.*
import kotlinx.android.synthetic.main.activity_funny1.*
import kotlinx.android.synthetic.main.activity_funny11.*
import kotlinx.android.synthetic.main.activity_funny3.*
import kotlinx.android.synthetic.main.activity_funny33.*

class Funny1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_funny1)

        backfun1.setOnClickListener {
            startActivity(Intent(this, btnfunny::class.java))

            nextfun1.setOnClickListener {
                startActivity(Intent(this,Funny11::class.java))
            }
        }
    }
}