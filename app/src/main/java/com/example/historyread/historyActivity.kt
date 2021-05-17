package com.example.historyread

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class historyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        val buttonsendWW1 = findViewById<Button>(R.id.worldwaroneButton)
        buttonsendWW1.setOnClickListener {
            val intent = Intent(this, wwoneActivity::class.java)
            startActivity(intent)
        }
        val buttonsendWW2 = findViewById<Button>(R.id.worldwartwoButton)
        buttonsendWW2.setOnClickListener {
            val intent = Intent(this, wwtwoActivity::class.java)
            startActivity(intent)
        }
    }
}
