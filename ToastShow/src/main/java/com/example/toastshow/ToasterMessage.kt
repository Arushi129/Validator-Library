package com.example.toastshow

import android.content.Context
import android.widget.Toast

 open class ToasterMessage {

    fun s(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}