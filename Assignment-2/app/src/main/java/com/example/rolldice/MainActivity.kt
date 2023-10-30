package com.example.rolldice

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

import java.util.*

class MainActivity : ComponentActivity() {
    private lateinit var resultTextView: TextView;
    private lateinit var rollButton: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.resultTextView)
        rollButton = findViewById(R.id.rollButton)

        rollButton.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice(){
        val random=Random()
        val randomNumber=random.nextInt( 6)+1
        val resultText="You rolled a $randomNumber"
        resultTextView.text=resultText
    }
}