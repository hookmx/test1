package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Mysterious1
import kotlinx.android.synthetic.main.activity_btnmysterious.*
import kotlinx.android.synthetic.main.activity_mysterious1.*

class btnmysterious : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_btnmysterious)

        backmys1.setOnClickListener {
            startActivity(Intent(this, FictionCate::class.java))

            mys1.setOnClickListener {
                startActivity(Intent(this,Mysterious1::class.java))

                mys2.setOnClickListener {
                    startActivity(Intent(this,Mysterious2::class.java))

                    mys3.setOnClickListener {
                        startActivity(Intent(this,Mysterious3::class.java))

                        mys4.setOnClickListener {
                            startActivity(Intent(this,Mysterious4::class.java))

                            mys5.setOnClickListener {
                                startActivity(Intent(this,Mysterious5::class.java))

                                mys6.setOnClickListener {
                                    startActivity(Intent(this,Mysterious6::class.java))
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}