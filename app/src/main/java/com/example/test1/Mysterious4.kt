package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Mysterious44
import com.example.test1.Mysterious66
import com.example.test1.btnmysterious
import kotlinx.android.synthetic.main.activity_btnmysterious.*
import kotlinx.android.synthetic.main.activity_mysterious4.*
import kotlinx.android.synthetic.main.activity_mysterious44.*
import kotlinx.android.synthetic.main.activity_mysterious6.*
import kotlinx.android.synthetic.main.activity_mysterious66.*

class Mysterious4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mysterious4)

        backmys4.setOnClickListener {
            startActivity(Intent(this, btnmysterious::class.java))

            nextmys4.setOnClickListener {
                startActivity(Intent(this,Mysterious44::class.java))
            }
        }
    }
}