package com.example.playlistmaker

import android.content.Intent
import android.net.Uri
import android.widget.ImageView
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.playlistmaker.R


class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        val arrowBack = findViewById<ImageView>(R.id.btn_back)
        arrowBack.setOnClickListener { finish() }

        findViewById<TextView>(R.id.tvShare).setOnClickListener{
            Intent(Intent.ACTION_SEND).apply {
                putExtra(Intent.EXTRA_TEXT,getString(R.string.share_ink))
                type = "text/plain"
                startActivity(this)
            }
        }
        findViewById<TextView>(R.id.tvSupport).setOnClickListener{
            Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL, arrayOf(getString(R.string.my_e_mail)))
                putExtra(Intent.EXTRA_SUBJECT,getString(R.string.massage_subject))
                putExtra(Intent.EXTRA_TEXT,getString(R.string.message_text))
                startActivity(this)
            }
        }
        findViewById<TextView>(R.id.tvTerms).setOnClickListener{
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.web_page_links))))
        }
    }
}