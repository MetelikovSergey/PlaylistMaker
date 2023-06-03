package com.example.playlistmaker

import android.content.Intent
import android.widget.ImageView
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.playlistmaker.R


class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        val arrowBack = findViewById<ImageView>(R.id.btn_back)
        arrowBack.setOnClickListener { finish() }
    }
}