package com.example.kampo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCompany: Button = findViewById(R.id.btnCompany)

        btnCompany.setOnClickListener{
            val intent = Intent(this, CompanyActivity::class.java)
            startActivity(intent)
        }
        val btnHistory: Button = findViewById(R.id.btnHistory)

        btnHistory.setOnClickListener{
            val intent = Intent(this, HistoryActivity::class.java)
            startActivity(intent)
        }
        val btnContact: Button = findViewById(R.id.btnContact)

        btnContact.setOnClickListener{
            val intent = Intent(this, GalActivity::class.java)
            startActivity(intent)
        }
    }

}