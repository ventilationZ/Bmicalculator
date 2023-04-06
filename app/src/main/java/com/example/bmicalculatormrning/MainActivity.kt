package com.example.bmicalculatormrning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var text_display:TextView
    private lateinit var text_weight:EditText
    private lateinit var text_height:EditText
    private lateinit var calculate_button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text_display=findViewById(R.id.txtdisplay)
        text_weight=findViewById(R.id.edtweight)
        text_height=findViewById(R.id.edtheight)
        calculate_button=findViewById(R.id.btncalculate)

        calculate_button.setOnClickListener {
            var first_number =text_weight.text.toString().trim()
            var second_number =text_height.text.toString().trim()

            if (first_number.isEmpty() ||second_number.isEmpty()){
                Toast.makeText(this, "Enter A Number", Toast.LENGTH_SHORT).show()
            }
            else{
                var sqr = second_number.toDouble() * second_number.toDouble()
                var answer = first_number.toDouble() / sqr
                text_display.text =answer.toString()}
        }
    }
}