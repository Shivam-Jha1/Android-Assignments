package com.coder178.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startActivity = findViewById<Button>(R.id.start_activity)
        startActivity.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

//        val startActivity = findViewById<Button>(R.id.start_button)
//        startActivity.setOnClickListener(View.OnClickListener {
//            val intent = Intent(this,MainActivity2::class.java).apply {  }
//            startActivity(intent)
//        })
    }
}