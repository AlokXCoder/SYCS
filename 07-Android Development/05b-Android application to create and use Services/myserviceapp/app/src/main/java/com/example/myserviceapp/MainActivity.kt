package com.example.myserviceapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startServiceButton = findViewById<Button>(R.id.btStart)
        val stopServiceButton = findViewById<Button>(R.id.btStop)

        // Start the service
        startServiceButton.setOnClickListener {
            val serviceIntent = Intent(this, NewService::class.java)
            startService(serviceIntent)
        }

        // Stop the service
        stopServiceButton.setOnClickListener {
            val serviceIntent = Intent(this, NewService::class.java)
            stopService(serviceIntent)
        }
    }
}
