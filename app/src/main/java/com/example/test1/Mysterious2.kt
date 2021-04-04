package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Mysterious22
import com.example.test1.Mysterious44
import com.example.test1.btnmysterious
import kotlinx.android.synthetic.main.activity_btnmysterious.*
import kotlinx.android.synthetic.main.activity_mysterious2.*
import kotlinx.android.synthetic.main.activity_mysterious22.*
import kotlinx.android.synthetic.main.activity_mysterious4.*
import kotlinx.android.synthetic.main.activity_mysterious44.*

class Mysterious2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mysterious2)

        backmys2.setOnClickListener {
            startActivity(Intent(this, btnmysterious::class.java))

            nextmys2.setOnClickListener {
                startActivity(Intent(this,Mysterious22::class.java))
            }
        }
    }
}