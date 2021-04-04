package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Mysterious55
import com.example.test1.Mysterious66
import com.example.test1.btnmysterious
import kotlinx.android.synthetic.main.activity_btnmysterious.*
import kotlinx.android.synthetic.main.activity_mysterious5.*
import kotlinx.android.synthetic.main.activity_mysterious55.*
import kotlinx.android.synthetic.main.activity_mysterious6.*
import kotlinx.android.synthetic.main.activity_mysterious66.*

class Mysterious5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mysterious5)

        backmys5.setOnClickListener {
            startActivity(Intent(this, btnmysterious::class.java))

            nextmys5.setOnClickListener {
                startActivity(Intent(this,Mysterious55::class.java))
            }
        }
    }
}