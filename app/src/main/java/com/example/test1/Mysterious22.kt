package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Mysterious22
import com.example.test1.Mysterious66
import com.example.test1.btnmysterious
import kotlinx.android.synthetic.main.activity_btnmysterious.*
import kotlinx.android.synthetic.main.activity_mysterious2.*
import kotlinx.android.synthetic.main.activity_mysterious22.*
import kotlinx.android.synthetic.main.activity_mysterious6.*
import kotlinx.android.synthetic.main.activity_mysterious66.*

class Mysterious22 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mysterious22)


        backmys22.setOnClickListener {
            startActivity(Intent(this,Mysterious2::class.java))
        }
    }
}
