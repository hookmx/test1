package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.btnaction
import com.example.test1.btnadventure
import com.example.test1.btnfantasy
import com.example.test1.btnfunny
import com.example.test1.btnmysterious
import kotlinx.android.synthetic.main.activity_btnaction.*
import kotlinx.android.synthetic.main.activity_btnadventure.*
import kotlinx.android.synthetic.main.activity_btnfantasy.*
import kotlinx.android.synthetic.main.activity_btnfunny.*
import kotlinx.android.synthetic.main.activity_btnmysterious.*
import kotlinx.android.synthetic.main.activity_fiction_cate.*
import kotlinx.android.synthetic.main.activity_fiction_cate.backad
import kotlinx.android.synthetic.main.activity_main.*

class FictionCate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fiction_cate)

        backad.setOnClickListener {
            startActivity(Intent(this, main::class.java))

            Action.setOnClickListener {
                startActivity(Intent(this, btnaction::class.java))

                mysterious.setOnClickListener {
                    startActivity(Intent(this, btnmysterious::class.java))

                    Adventure.setOnClickListener {
                        startActivity(Intent(this, btnadventure::class.java))

                        Funny.setOnClickListener {
                            startActivity(Intent(this, btnfunny::class.java))

                            Thriller.setOnClickListener {
                                startActivity(Intent(this,btnthriller::class.java))

                                Drama.setOnClickListener {
                                    startActivity(Intent(this, btndrama::class.java))

                                    Fantasy.setOnClickListener {
                                        startActivity(Intent(this, btnfantasy::class.java))

                                        Romance.setOnClickListener {
                                            startActivity(Intent(this, btnromance::class.java))
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}