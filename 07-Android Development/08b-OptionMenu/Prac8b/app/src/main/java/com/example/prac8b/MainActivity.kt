package com.example.prac8b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        when (id) {
            R.id.First -> Toast.makeText(applicationContext, "Login is selected", Toast.LENGTH_LONG).show()
            R.id.Second -> Toast.makeText(applicationContext, "Register is selected", Toast.LENGTH_LONG).show()
            R.id.Third -> Toast.makeText(applicationContext, "Setting is selected", Toast.LENGTH_LONG).show()
            R.id.Fourth -> Toast.makeText(applicationContext, "Share is selected", Toast.LENGTH_LONG).show()
            R.id.Fifth -> Toast.makeText(applicationContext, "Bluetooth is selected", Toast.LENGTH_LONG).show()
            R.id.Sixth -> Toast.makeText(applicationContext, "Mail is selected", Toast.LENGTH_LONG).show()
        }
        return super.onOptionsItemSelected(item)
    }
}
