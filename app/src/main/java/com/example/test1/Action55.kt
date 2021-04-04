package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Action1
import com.example.test1.Action5
import kotlinx.android.synthetic.main.activity_action1.*
import kotlinx.android.synthetic.main.activity_action11.*
import kotlinx.android.synthetic.main.activity_action5.*
import kotlinx.android.synthetic.main.activity_action55.*

class Action55 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action55)

        backac55.setOnClickListener {
            startActivity(Intent(this, Action5::class.java))
        }
    }
}