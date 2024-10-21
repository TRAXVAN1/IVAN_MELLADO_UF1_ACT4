package com.example.ivan_mellado_uf1_act4

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val logcatButton: Button = findViewById(R.id.logcat)
        val toastButton: Button = findViewById(R.id.toast)

        logcatButton.setOnClickListener {
            android.util.Log.d("MainActivity", getString(R.string.logcatAnswer))
        }

        toastButton.setOnClickListener {
            Toast.makeText(this, getString(R.string.toastAnswer), Toast.LENGTH_SHORT).show()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}