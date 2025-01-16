package com.example.alpha

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.view.View
import android.widget.*
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity)
        val Name = findViewById<EditText>(R.id.name)
        val submitButton= findViewById<Button>(R.id.button)
        val dispMessage = findViewById<TextView>(R.id.textViewResponse)
        val radioGroup= findViewById<RadioGroup>(R.id.selectgender)
        val radioB1=findViewById<RadioButton>(R.id.radioButton1)
        val radioB2=findViewById<RadioButton>(R.id.radioButton2)
        val CheckB1= findViewById<CheckBox>(R.id.checkBox1)
        val CheckB2= findViewById<CheckBox>(R.id.checkBox2)
        val CodingLang = findViewById<TextView>(R.id.language)
        val Universityyear= findViewById<Spinner>(R.id.spinner)
        val myclass = findViewById<TextView>(R.id.myclass)
        val year=arrayOf("FYCS","SYCS","TYCS")

        val arrayAdp = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,year)
        Universityyear.adapter= arrayAdp
        Universityyear.onItemSelectedListener= object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position:
            Int, p3: Long) {
                myclass.text= "Your Class: " + year[position]
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                myclass.text= "Please select Your Class"
            } }
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId==R.id.radioButton1)
                dispMessage.setText("Gender" + radioB1.text)
            if(checkedId==R.id.radioButton2)
                dispMessage.setText("Gender" + radioB2.text)
        }
        submitButton.setOnClickListener{
            val selectedGender = when (radioGroup.checkedRadioButtonId) {
                R.id.radioButton1 -> radioB1.text.toString()
                R.id.radioButton2 -> radioB2.text.toString()
                else -> "Not specified"
            }
            dispMessage.text = "Welcome ${Name.text}, Gender: $selectedGender"
            if(CheckB1.isChecked && CheckB2.isChecked){
                CodingLang.text= "You love both languages" }
            else if(CheckB1.isChecked){
                CodingLang.text= "You love Python" }
            else if(CheckB2.isChecked){
                CodingLang.text= "You love Kotlin" }
            else {
                CodingLang.text= "You don't like these languages" }
        }
    }
}

