package com.example.mymemoirhomepage1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.os.Bundle
import android.widget.Button
//import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layout: ConstraintLayout = findViewById(R.id.layout)
        val setGoalButton: Button = findViewById(R.id.setGoalButton)
        val viewGoalButton: Button = findViewById(R.id.viewGoalButton)

        setGoalButton.setOnClickListener {
            // Handle Set Goal button click event
        }

        viewGoalButton.setOnClickListener {
            // Handle View Goal button click event
        }
    }
}