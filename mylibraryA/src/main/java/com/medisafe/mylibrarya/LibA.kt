package com.medisafe.mylibrarya

import android.util.Log
import com.google.gson.Gson
import com.medisafe.mylibraryb.LibB

class LibA {

    fun run(){
        Log.i("mendi", "LibA")
        val a  = Gson()
        Log.i("mendi", "LibA gson:$a")

        LibB().run()
    }
}