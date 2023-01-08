package com.example.hashcodegenerator

import android.util.Log
import androidx.lifecycle.ViewModel
import java.security.MessageDigest

class HomeViewModel: ViewModel() {
    fun getHash(plainText: String, algorithm: String): String{
        val byte = MessageDigest.getInstance(algorithm).digest(plainText.toByteArray())
        return toHex(byte)
    }

    private fun toHex(byteArray: ByteArray): String{
        return byteArray.joinToString(""){"%02x".format(it)}
    }
}