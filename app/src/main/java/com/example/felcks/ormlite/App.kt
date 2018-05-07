package com.example.felcks.ormlite

/**
 * Created by felcks on 5/7/18.
 */
import android.app.Application
import kotlin.reflect.KProperty

class App : Application() {

    companion object {
        lateinit var instance: App
    }

    init {
        instance = this
    }
}

