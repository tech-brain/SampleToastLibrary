package com.sampleToastLibrary

import android.content.Context
import android.widget.Toast

class SampleToast {
    companion object{
        fun showToast(context: Context, msg : String){
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }
    }
}