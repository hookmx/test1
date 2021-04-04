package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Mysterious33
import com.example.test1.Mysterious66
import com.example.test1.btnmysterious
import kotlinx.android.synthetic.main.activity_btnmysterious.*
import kotlinx.android.synthetic.main.activity_mysterious3.*
import kotlinx.android.synthetic.main.activity_mysterious33.*
import kotlinx.android.synthetic.main.activity_mysterious6.*
import kotlinx.android.synthetic.main.activity_mysterious66.*

class Mysterious33 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mysterious33)


        backmys33.setOnClickListener {
            startActivity(Intent(this,Mysterious3::class.java))
        }
    }
}