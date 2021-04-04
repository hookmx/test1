package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Fantasy1
import com.example.test1.Fantasy2
import com.example.test1.Fantasy3
import com.example.test1.Fantasy4
import com.example.test1.Fantasy5
import com.example.test1.Fantasy6
import com.example.test1.FictionCate
import kotlinx.android.synthetic.main.activity_btnfantasy.*
import kotlinx.android.synthetic.main.activity_fantasy1.*
import kotlinx.android.synthetic.main.activity_fantasy2.*
import kotlinx.android.synthetic.main.activity_fantasy3.*
import kotlinx.android.synthetic.main.activity_fantasy4.*
import kotlinx.android.synthetic.main.activity_fantasy5.*
import kotlinx.android.synthetic.main.activity_fantasy6.*
import kotlinx.android.synthetic.main.activity_fiction_cate.*

class btnfantasy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_btnfantasy)

        backfan.setOnClickListener {
            startActivity(Intent(this, FictionCate::class.java))

            fan1.setOnClickListener {
                startActivity(Intent(this,Fantasy1::class.java))

                fan2.setOnClickListener {
                    startActivity(Intent(this,Fantasy2::class.java))

                    fan3.setOnClickListener {
                        startActivity(Intent(this,Fantasy3::class.java))

                        fan4.setOnClickListener {
                            startActivity(Intent(this,Fantasy4::class.java))

                            fan5.setOnClickListener {
                                startActivity(Intent(this,Fantasy5::class.java))

                                fan6.setOnClickListener {
                                    startActivity(Intent(this,Fantasy6::class.java))
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
