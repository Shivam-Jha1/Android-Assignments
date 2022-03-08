package com.coder178.clickcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text:TextView = findViewById(R.id.textView)
        val button:Button = findViewById(R.id.button)
        var no:Int = 0
        text.text = "Button is not clicked till now"
        button.setOnClickListener(View.OnClickListener {
            no++
            text.text = "Button is clicked $no times"
        })

    }
}