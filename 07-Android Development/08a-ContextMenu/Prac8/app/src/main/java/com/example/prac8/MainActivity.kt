package com.example.prac8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
class MainActivity : AppCompatActivity()
{
    lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.button1)
        registerForContextMenu(btn)
    }
    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.context_menu,menu)
    }
    override fun onContextItemSelected(item: MenuItem): Boolean
    {
        val id = item.itemId
        if(id == R.id.First)
        {
            Toast.makeText(this,"Login is selected",Toast.LENGTH_LONG).show()
        }
        else if(id == R.id.Second)
        {
            Toast.makeText(applicationContext,"Register is selected",Toast.LENGTH_LONG).show()
        }
        else if(id == R.id.Third)
        {
            Toast.makeText(applicationContext,"Setting is selected",Toast.LENGTH_LONG).show()
        }
        else if(id == R.id.Fourth)
        {
            Toast.makeText(applicationContext, "Share is selected",
                Toast.LENGTH_LONG).show()
        }
        else if (id == R.id.Fifth)
        {
            Toast.makeText(applicationContext, "Bluetooth is selected",
                Toast.LENGTH_LONG).show()
        }
        else if (id == R.id.Sixth)
        {
            Toast.makeText(applicationContext, "Mail is selected",
                Toast.LENGTH_LONG).show()
        }
        return super.onContextItemSelected(item)
    }
}