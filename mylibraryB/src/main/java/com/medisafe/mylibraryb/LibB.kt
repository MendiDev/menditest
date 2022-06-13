package com.medisafe.mylibraryb

import android.util.Log
import com.medisafe.mylibraryc.LibC

class LibB {

    fun run(){
        Log.i("mendi", "LibB")
        LibC().run()
    }
}