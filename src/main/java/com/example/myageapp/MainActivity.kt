package com.example.myageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.butGetAge)
        rollButton.setOnClickListener { rollDice() }

    }

    private fun rollDice() {
        val edDOB: EditText = findViewById(R.id.edDOB)
      val userDOB : Int =Integer.parseInt(edDOB.text.toString())
      val currentYear: Int =Calendar.getInstance().get(Calendar.YEAR)
      val userAgeIntYears : Int = currentYear - userDOB
        val tvShowAge : TextView = findViewById(R.id.tvShowAge)
        tvShowAge.text= "You Age is $userAgeIntYears Years"


    }
}

