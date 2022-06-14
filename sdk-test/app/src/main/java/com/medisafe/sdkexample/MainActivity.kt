package com.medisafe.sdkexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.medisafe.mylibrarya.LibA

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LibA().run()
    }
}