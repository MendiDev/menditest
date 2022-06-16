package com.medisafe.mylibrarya

import android.content.Context
import android.util.Log
import com.skydoves.balloon.Balloon

class LibA {

    fun run(context: Context){
        Log.i("mendi", "LibA - 15")

            val baloon = Balloon.Builder(context)
        Log.i("mendi", "LibA: $baloon")

    }
}
