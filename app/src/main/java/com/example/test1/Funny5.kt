package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Funny55
import com.example.test1.Funny66
import com.example.test1.btnfunny
import kotlinx.android.synthetic.main.activity_btnfunny.*
import kotlinx.android.synthetic.main.activity_funny5.*
import kotlinx.android.synthetic.main.activity_funny55.*
import kotlinx.android.synthetic.main.activity_funny6.*
import kotlinx.android.synthetic.main.activity_funny66.*

class Funny5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_funny5)


        backfun5.setOnClickListener {
            startActivity(Intent(this, btnfunny::class.java))

            nextfun5.setOnClickListener {
                startActivity(Intent(this,Funny55::class.java))
            }
        }
    }
}


