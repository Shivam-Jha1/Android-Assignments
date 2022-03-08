package com.coder178.fragment_interaction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = onefragment()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.conatiner,fragment)
        fragmentTransaction.commit()

        val showFragmentMessage = findViewById<Button>(R.id.button1)
        showFragmentMessage.setOnClickListener {
            val fragment = supportFragmentManager.findFragmentById(R.id.container) as onefragment
            fragment.showFragmentMessage()
        }
    }
}