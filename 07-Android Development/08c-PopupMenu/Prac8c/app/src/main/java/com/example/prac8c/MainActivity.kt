package com.example.prac8c

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.button1)
    }

    fun showpopupmenu(view: View) {
        val popMenu = PopupMenu(this, btn)
        popMenu.inflate(R.menu.popupmenu)
        popMenu.show()

        popMenu.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.First -> {
                    Toast.makeText(applicationContext, "Login is selected", Toast.LENGTH_LONG).show()
                }
                R.id.Second -> {
                    Toast.makeText(applicationContext, "Register is selected", Toast.LENGTH_LONG).show()
                }
                R.id.Third -> {
                    Toast.makeText(applicationContext, "Setting is selected", Toast.LENGTH_LONG).show()
                }
            }
            true
        }
    }
}
