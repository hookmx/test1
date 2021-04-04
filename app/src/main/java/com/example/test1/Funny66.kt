package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Funny1
import com.example.test1.Funny6
import kotlinx.android.synthetic.main.activity_funny1.*
import kotlinx.android.synthetic.main.activity_funny11.*
import kotlinx.android.synthetic.main.activity_funny6.*
import kotlinx.android.synthetic.main.activity_funny66.*

class Funny66 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_funny66)

        backfun66.setOnClickListener {
            startActivity(Intent(this, Funny6::class.java))
        }
    }
}