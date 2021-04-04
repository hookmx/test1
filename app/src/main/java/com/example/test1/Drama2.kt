package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Drama11
import com.example.test1.Drama22
import com.example.test1.btndrama
import kotlinx.android.synthetic.main.activity_btndrama.*
import kotlinx.android.synthetic.main.activity_drama1.*
import kotlinx.android.synthetic.main.activity_drama11.*
import kotlinx.android.synthetic.main.activity_drama2.*
import kotlinx.android.synthetic.main.activity_drama22.*

class Drama2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drama2)

        backdra2.setOnClickListener {
            startActivity(Intent(this, btndrama::class.java))

            nextdra2.setOnClickListener {
                startActivity(Intent(this,Drama22::class.java))
            }
        }
    }
}