package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Drama11
import com.example.test1.Drama55
import com.example.test1.btndrama
import kotlinx.android.synthetic.main.activity_btndrama.*
import kotlinx.android.synthetic.main.activity_drama1.*
import kotlinx.android.synthetic.main.activity_drama11.*
import kotlinx.android.synthetic.main.activity_drama5.*
import kotlinx.android.synthetic.main.activity_drama55.*

class Drama5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drama5)

        backdra5.setOnClickListener {
            startActivity(Intent(this, btndrama::class.java))

            nextdra5.setOnClickListener {
                startActivity(Intent(this,Drama55::class.java))
            }
        }
    }
}