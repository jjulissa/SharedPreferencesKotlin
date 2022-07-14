package com.example.sharedpreferenceskotlin

import android.content.Context
import android.content.SharedPreferences

class Prefs(val context: Context) {

//    SakFewMeteVariabLaAnMajuskul,SePaskewDi,
//    seYonKonstanKewKreye,KonstanPaKaChanje.(NuncaCambia).
    val SHARED_NAME = "YAHWEH"
    val SHARED_USER_NAME = "userName"
    val SHARED_VIP = "vip"
//    val prefs: SharedPreferences = context.getSharedPreferences(PREFS_NAME, 0)

    val storage = context.getSharedPreferences(SHARED_NAME, 0)

// AvekFonksyonSaNouGuardarNomUsuarioA,antreA...
    fun saveName(name:String) {
//  edit(), metodoEditLaYoUseLiNanKotlinNan,PouLewBezwenAjouteYonBagay.OuDilPranDB,editel,MetelAnString...
        storage.edit().putString(SHARED_USER_NAME, name).apply()
    }

    fun saveVIP(vip:Boolean) {
//  .apply(),AplikameLosCambios.
        storage.edit().putBoolean(SHARED_VIP, vip).apply()
    }

// getName():String, OuDiSeYonStringFuncionAnPralDevolver...
    fun getName():String {
        return storage.getString(SHARED_USER_NAME, " ")!!
    }

    fun getVIP():Boolean {
        return storage.getBoolean(SHARED_VIP, false)
    }

    fun wipe() {
        storage.edit().apply()
    }

}