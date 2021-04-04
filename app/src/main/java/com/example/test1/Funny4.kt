package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Funny44
import com.example.test1.Funny66
import com.example.test1.btnfunny
import kotlinx.android.synthetic.main.activity_btnfunny.*
import kotlinx.android.synthetic.main.activity_funny4.*
import kotlinx.android.synthetic.main.activity_funny44.*
import kotlinx.android.synthetic.main.activity_funny6.*
import kotlinx.android.synthetic.main.activity_funny66.*

class Funny4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_funny4)

        backfun4.setOnClickListener {
            startActivity(Intent(this, btnfunny::class.java))

            nextfun4.setOnClickListener {
                startActivity(Intent(this,Funny44::class.java))
            }
        }
    }
}
