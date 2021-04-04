package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Mysterious11
import com.example.test1.Mysterious22
import com.example.test1.Mysterious44
import com.example.test1.btnmysterious
import kotlinx.android.synthetic.main.activity_btnmysterious.*
import kotlinx.android.synthetic.main.activity_mysterious1.*
import kotlinx.android.synthetic.main.activity_mysterious11.*
import kotlinx.android.synthetic.main.activity_mysterious2.*
import kotlinx.android.synthetic.main.activity_mysterious22.*
import kotlinx.android.synthetic.main.activity_mysterious44.*

class Mysterious1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mysterious1)

        backmys1.setOnClickListener {
            startActivity(Intent(this, btnmysterious::class.java))

            nextmys1.setOnClickListener {
                startActivity(Intent(this,Mysterious11::class.java))
            }
        }
    }
}
