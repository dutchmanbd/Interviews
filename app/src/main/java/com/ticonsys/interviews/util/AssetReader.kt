package com.ticonsys.interviews.util

import android.content.Context

class AssetReader(
    private val context: Context
) {

    fun read(fileName: String): String {
        return context.assets.open(fileName).bufferedReader().use { reader ->
            reader.readText()
        }
    }

}