package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Drama11
import com.example.test1.Drama44
import com.example.test1.btndrama
import kotlinx.android.synthetic.main.activity_btndrama.*
import kotlinx.android.synthetic.main.activity_drama1.*
import kotlinx.android.synthetic.main.activity_drama11.*
import kotlinx.android.synthetic.main.activity_drama4.*
import kotlinx.android.synthetic.main.activity_drama44.*

class Drama4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drama4)

        backdra4.setOnClickListener {
            startActivity(Intent(this, btndrama::class.java))

            nextdra4.setOnClickListener {
                startActivity(Intent(this,Drama44::class.java))
            }
        }
    }
}