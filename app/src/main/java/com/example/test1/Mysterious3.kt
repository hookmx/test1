package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Mysterious33
import com.example.test1.Mysterious44
import com.example.test1.btnmysterious
import kotlinx.android.synthetic.main.activity_btnmysterious.*
import kotlinx.android.synthetic.main.activity_mysterious3.*
import kotlinx.android.synthetic.main.activity_mysterious33.*
import kotlinx.android.synthetic.main.activity_mysterious4.*
import kotlinx.android.synthetic.main.activity_mysterious44.*

class Mysterious3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mysterious3)

        backmys3.setOnClickListener {
            startActivity(Intent(this, btnmysterious::class.java))

            nextmys3.setOnClickListener {
                startActivity(Intent(this,Mysterious33::class.java))
            }
        }
    }
}