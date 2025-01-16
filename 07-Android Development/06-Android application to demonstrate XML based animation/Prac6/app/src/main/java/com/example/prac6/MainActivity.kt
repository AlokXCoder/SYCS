package com.example.prac6

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.prac6.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Load the bounce animation from the bounce.xml file
        val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.bounce)

        // Get the button from the layout
        val button: Button = findViewById(R.id.button)

        // Set an OnClickListener to start the animation when the button is clicked
        button.setOnClickListener {
            button.startAnimation(animation)
        }
    }
}
