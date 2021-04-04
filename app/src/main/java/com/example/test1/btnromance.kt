package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.FictionCate
import kotlinx.android.synthetic.main.activity_btnadventure.*
import kotlinx.android.synthetic.main.activity_btnromance.*
import kotlinx.android.synthetic.main.activity_fiction_cate.*
import kotlinx.android.synthetic.main.activity_fiction_cate.backad

class btnromance : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_btnromance)

        backro.setOnClickListener {
            startActivity(Intent(this, FictionCate::class.java))

            ro1.setOnClickListener {
                startActivity(Intent(this,Romance1::class.java))

                ro2.setOnClickListener {
                    startActivity(Intent(this,Romance2::class.java))

                    ro3.setOnClickListener {
                        startActivity(Intent(this,Romance3::class.java))

                        ro4.setOnClickListener {
                            startActivity(Intent(this,Romance4::class.java))

                            ro5.setOnClickListener {
                                startActivity(Intent(this,Romance5::class.java))

                                ro6.setOnClickListener {
                                    startActivity(Intent(this,Romance6::class.java))
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
