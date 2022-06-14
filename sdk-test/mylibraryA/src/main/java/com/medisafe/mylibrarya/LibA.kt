package com.medisafe.mylibrarya

import android.util.Log
import com.medisafe.mylibraryb.LibB

class LibA {

    fun run(){
        Log.i("mendi", "LibA")
        LibB().run()
    }
}