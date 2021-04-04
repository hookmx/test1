package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_btnfunny.*

class btnfunny : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_btnfunny)

        backfun.setOnClickListener {
            startActivity(Intent(this,FictionCate::class.java))

            fun1.setOnClickListener {
                startActivity(Intent(this,Funny1::class.java))

                fun2.setOnClickListener {
                    startActivity(Intent(this,Funny2::class.java))

                    fun3.setOnClickListener {
                        startActivity(Intent(this,Funny3::class.java))

                        fun4.setOnClickListener {
                            startActivity(Intent(this,Funny4::class.java))

                            fun5.setOnClickListener {
                                startActivity(Intent(this,Funny5::class.java))

                                fun6.setOnClickListener {
                                    startActivity(Intent(this,Funny6::class.java))
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

