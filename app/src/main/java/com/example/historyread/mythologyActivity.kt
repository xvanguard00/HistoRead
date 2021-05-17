package com.example.historyread

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class mythologyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mythology)

        val buttonsendNorse = findViewById<Button>(R.id.norseButton)
        buttonsendNorse.setOnClickListener {
            val intent = Intent(this, norseActivity::class.java)
            startActivity(intent)
        }
        val buttonsendRoman = findViewById<Button>(R.id.romanButton)
        buttonsendRoman.setOnClickListener {
            val intent = Intent(this, romanActivity::class.java)
            startActivity(intent)
        }
        val buttonsendGreek = findViewById<Button>(R.id.greekButton)
        buttonsendGreek.setOnClickListener {
            val intent = Intent(this, greekActivity::class.java)
            startActivity(intent)
        }
        val buttonsendPagan = findViewById<Button>(R.id.paganButton)
        buttonsendPagan.setOnClickListener {
            val intent = Intent(this, paganActivity::class.java)
            startActivity(intent)
        }
    }
}