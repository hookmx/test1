package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Adventure22
import com.example.test1.Adventure66
import com.example.test1.btnadventure
import kotlinx.android.synthetic.main.activity_adventure2.*
import kotlinx.android.synthetic.main.activity_adventure22.*
import kotlinx.android.synthetic.main.activity_adventure6.*
import kotlinx.android.synthetic.main.activity_adventure66.*
import kotlinx.android.synthetic.main.activity_btnadventure.*

class Adventure6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adventure6)

        backad6.setOnClickListener {
            startActivity(Intent(this,btnadventure::class.java))

            nextad6.setOnClickListener {
                startActivity(Intent(this,Adventure66::class.java))
            }
        }
    }
}

