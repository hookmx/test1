package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.FictionCate
import kotlinx.android.synthetic.main.activity_btnadventure.*
import kotlinx.android.synthetic.main.activity_btndrama.*
import kotlinx.android.synthetic.main.activity_fiction_cate.*
import kotlinx.android.synthetic.main.activity_fiction_cate.backad

class btndrama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_btndrama)

        backdra.setOnClickListener {
            startActivity(Intent(this, FictionCate::class.java))

            dra1.setOnClickListener {
                startActivity(Intent(this,Drama1::class.java))

                dra2.setOnClickListener {
                    startActivity(Intent(this,Drama2::class.java))

                    dra3.setOnClickListener {
                        startActivity(Intent(this,Drama3::class.java))

                        dra4.setOnClickListener {
                            startActivity(Intent(this,Drama4::class.java))

                            dra5.setOnClickListener {
                                startActivity(Intent(this,Drama5::class.java))

                                dra6.setOnClickListener {
                                    startActivity(Intent(this,Drama6::class.java))
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
