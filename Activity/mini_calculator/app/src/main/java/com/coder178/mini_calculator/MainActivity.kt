package com.coder178.mini_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val add:Button = findViewById(R.id.add)
        val subtract:Button = findViewById(R.id.subtract)
        val multiply:Button = findViewById(R.id.multiply)
        val divide:Button = findViewById(R.id.divide)

        val n1:EditText = findViewById(R.id.n1)
        val n2:EditText = findViewById(R.id.n2)
        val textView:TextView = findViewById(R.id.textView)

        add.setOnClickListener(View.OnClickListener {
            val x1:Int = Integer.parseInt(n1.text.toString())
            val x2:Int = Integer.parseInt(n2.text.toString())
            var x:Int = x1+x2
            textView.setText("Sum of $x1 and $x2 is $x")
        })
        subtract.setOnClickListener(View.OnClickListener {
            val x1:Int = Integer.parseInt(n1.text.toString())
            val x2:Int = Integer.parseInt(n2.text.toString())
            var x:Int = x1-x2
            textView.setText("Subtraction of $x1 from $x2 is $x")
        })
        multiply.setOnClickListener(View.OnClickListener {
            val x1:Int = Integer.parseInt(n1.text.toString())
            val x2:Int = Integer.parseInt(n2.text.toString())
            var x:Int = x1*x2
            textView.setText("Product of $x1 and $x2 is $x")
        })
        divide.setOnClickListener(View.OnClickListener {
            val x1:Int = Integer.parseInt(n1.text.toString())
            val x2:Int = Integer.parseInt(n2.text.toString())
            var x:Int = x1/x2
            textView.setText("Division of $x1 by $x2 is $x")
        })
    }
}