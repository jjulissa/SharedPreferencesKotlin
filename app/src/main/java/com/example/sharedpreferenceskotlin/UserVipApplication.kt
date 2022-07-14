package com.example.sharedpreferenceskotlin

import android.app.Application

class UserVipApplication : Application() {
    companion object{

//  lateinit, VleDiVaryab,mKreyeLa,
//  PralInicializeMasTarde.
        lateinit var prefs: Prefs
    }

    override fun onCreate() {
        super.onCreate()
        prefs = Prefs(applicationContext)
    }
}