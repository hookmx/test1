package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Action1
import com.example.test1.Action4
import com.example.test1.Action5
import com.example.test1.Action6
import com.example.test1.FictionCate
import kotlinx.android.synthetic.main.activity_action1.*
import kotlinx.android.synthetic.main.activity_action4.*
import kotlinx.android.synthetic.main.activity_action5.*
import kotlinx.android.synthetic.main.activity_action6.*
import kotlinx.android.synthetic.main.activity_btnaction.*
import kotlinx.android.synthetic.main.activity_btnthriller.*
import kotlinx.android.synthetic.main.activity_fiction_cate.*

class btnthriller : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_btnthriller)

        backthr.setOnClickListener {
            startActivity(Intent(this,FictionCate::class.java))

            thr1.setOnClickListener {
                startActivity(Intent(this,Thriller1::class.java))

                thr2.setOnClickListener {
                    startActivity(Intent(this,Thriller2::class.java))

                    thr3.setOnClickListener {
                        startActivity(Intent(this,Thriller3::class.java))

                        thr4.setOnClickListener {
                            startActivity(Intent(this,Thriller4::class.java))

                            thr5.setOnClickListener {
                                startActivity(Intent(this,Thriller5::class.java))

                                thr6.setOnClickListener {
                                    startActivity(Intent(this,Thriller6::class.java))
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
