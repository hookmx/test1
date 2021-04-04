package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Fantasy66
import com.example.test1.Funny66
import com.example.test1.btnfunny
import kotlinx.android.synthetic.main.activity_btnfunny.*
import kotlinx.android.synthetic.main.activity_fantasy6.*
import kotlinx.android.synthetic.main.activity_fantasy66.*
import kotlinx.android.synthetic.main.activity_funny6.*
import kotlinx.android.synthetic.main.activity_funny66.*

class Funny6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_funny6)

        backfun6.setOnClickListener {
            startActivity(Intent(this, btnfunny::class.java))

            nextfun6.setOnClickListener {
                startActivity(Intent(this,Funny66::class.java))
            }
        }
    }
}
