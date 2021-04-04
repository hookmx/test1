package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Mysterious11
import com.example.test1.Romance11
import com.example.test1.btnmysterious
import kotlinx.android.synthetic.main.activity_btnmysterious.*
import kotlinx.android.synthetic.main.activity_btnromance.*
import kotlinx.android.synthetic.main.activity_mysterious1.*
import kotlinx.android.synthetic.main.activity_mysterious11.*
import kotlinx.android.synthetic.main.activity_romance1.*
import kotlinx.android.synthetic.main.activity_romance11.*

class Romance1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_romance1)

        backro1.setOnClickListener {
            startActivity(Intent(this, btnromance::class.java))

            nextro1.setOnClickListener {
                startActivity(Intent(this,Romance11::class.java))
            }
        }
    }
}
