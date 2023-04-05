package com.example.simple_calculator_app_nate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var txt_display_answer:TextView
    private lateinit var edtFirst:EditText
    private lateinit var edtSecond:EditText
    private lateinit var add_button:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Instatiate Variables
        txt_display_answer=findViewById(R.id.txtAnswer)
        edtFirst=findViewById(R.id.edtFirstNumber)
        edtSecond=findViewById(R.id.edtSecondNumber)
        add_button=findViewById(R.id.btnAdd)

        add_button.setOnClickListener {
            var first_num = edtFirst.text.toString().trim()
            var second_num = edtSecond.text.toString().trim()
            //user validation
            if (first_num.isEmpty() || second_num.isEmpty()){
                Toast.makeText(this, "PLEASE ENETR A NUMBER", Toast.LENGTH_SHORT).show()
            }
            else{
                var answer = first_num.toDouble() + second_num.toDouble()
                txt_display_answer.text = answer.toString()
//                Toast.makeText(this, "Trying to add two numbers", Toast.LENGTH_SHORT).show()
            }
//            Toast.makeText(this, "HELLO World", Toast.LENGTH_SHORT).show()
        }
    }
}