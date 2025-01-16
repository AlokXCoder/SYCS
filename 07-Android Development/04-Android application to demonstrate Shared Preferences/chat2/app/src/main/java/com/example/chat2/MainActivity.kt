package com.example.chat2

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.chat2.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView (R.layout.activity_main)

        // Initialize views
        val etName = findViewById<EditText>(R.id.etName)
        val etRollNo = findViewById<EditText>(R.id.etRollNo)
        val btnSave = findViewById<Button>(R.id.btnSave)
        val btnGet = findViewById<Button>(R.id.btnGet)

        // Get SharedPreferences object
        val sharedPref = getSharedPreferences("StudentData", MODE_PRIVATE)
        val editor = sharedPref.edit()

        // Save button listener
        btnSave.setOnClickListener {
            val name = etName.text.toString()
            val rollNo = etRollNo.text.toString()

            if (name.isNotEmpty() && rollNo.isNotEmpty()) {
                editor.putString("name", name)
                editor.putString("rollno", rollNo)
                editor.apply() // Save data asynchronously

                Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter both fields", Toast.LENGTH_SHORT).show()
            }
        }

        // Get button listener
        btnGet.setOnClickListener {
            val savedName = sharedPref.getString("name", "No name saved")
            val savedRollNo = sharedPref.getString("rollno", "No roll number saved")

            Toast.makeText(this, "Name: $savedName\nRoll No: $savedRollNo", Toast.LENGTH_SHORT).show()
        }
    }
}
