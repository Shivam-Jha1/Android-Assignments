package com.coder178.enable_disable_button

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
        val button2:Button = findViewById(R.id.button2)

        var no:Int = 0
        text.text = "Button is not clicked till now"
        button.setOnClickListener(View.OnClickListener {
            no++
            text.text = "Button is clicked $no times"
        })
        var n:Int = 0
        button2.setOnClickListener(View.OnClickListener {
           if(n%2==0) {
               button2.setText("ENABLE")
               button.isEnabled = false
               n++
           }
            else {
                button2.setText("DISABLE")
               button.isEnabled = true
               n++
           }
        })
    }
}