package com.jmarkstar.kmpconcept

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jmarkstar.common.helloWorld
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvHello.text = helloWorld()
    }
}
