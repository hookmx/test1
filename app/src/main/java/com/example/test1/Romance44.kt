package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Romance1
import com.example.test1.Romance4
import kotlinx.android.synthetic.main.activity_romance1.*
import kotlinx.android.synthetic.main.activity_romance11.*
import kotlinx.android.synthetic.main.activity_romance4.*
import kotlinx.android.synthetic.main.activity_romance44.*

class Romance44 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_romance44)

        backro44.setOnClickListener {
            startActivity(Intent(this,Romance4::class.java))
        }
    }
}
