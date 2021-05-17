package com.example.historyread

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val selectionMythology = findViewById<Button>(R.id.mythologyButton)
        val selectionHistory = findViewById<Button>(R.id.historyButton)

        selectionMythology.setOnClickListener {
            val intentmyth = Intent(this, mythologyActivity::class.java)
            startActivity(intentmyth)
        }//endMythologyButton

        selectionHistory.setOnClickListener {
            val intenthistory = Intent(this, historyActivity::class.java)
            startActivity(intenthistory)
        } //endHistoryButton



    }
}