package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Drama11
import com.example.test1.Drama66
import com.example.test1.btndrama
import kotlinx.android.synthetic.main.activity_btndrama.*
import kotlinx.android.synthetic.main.activity_drama1.*
import kotlinx.android.synthetic.main.activity_drama11.*
import kotlinx.android.synthetic.main.activity_drama6.*
import kotlinx.android.synthetic.main.activity_drama66.*

class Drama6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drama6)

        backdra6.setOnClickListener {
            startActivity(Intent(this, btndrama::class.java))

            nextdra6.setOnClickListener {
                startActivity(Intent(this,Drama66::class.java))
            }
        }
    }
}