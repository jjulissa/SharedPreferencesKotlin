package com.example.sharedpreferenceskotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.sharedpreferenceskotlin.UserVipApplication.Companion.prefs
import com.example.sharedpreferenceskotlin.databinding.ActivityMainBinding
import com.example.sharedpreferenceskotlin.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_result)
        initUI()
    }

    fun initUI() {
//  Btn,apAvizeLesUsuarioA,KlikeSouLi
        binding.btnBack.setOnClickListener {
            prefs.wipe()
            onBackPressed()
        }
        val userName= prefs.getName()
        binding.tvName.text = "Welcome $userName"
        if(prefs.getVIP()) {
            setVIPColorBackground()
        }
    }

    fun setVIPColorBackground() {
        binding.container.setBackgroundColor(ContextCompat.getColor(this, R.color.vip_yellow))
    }
}