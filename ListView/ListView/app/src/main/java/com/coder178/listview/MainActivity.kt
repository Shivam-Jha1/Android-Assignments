package com.coder178.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = arrayOf("Groceries","Transportation","Rent","Cell phone","Utility bills","insurance","petrol",
            "Food","travel","weekends","party","landline","Electricity","Services","Tax","Clothes","Loan")

        val expense:ListView = findViewById(R.id.expense)
        val expenseAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,items)

        expense.adapter = expenseAdapter
        expense.setOnItemClickListener { adapterView, view, position, id ->
            val item:TextView = view as TextView
            Toast.makeText(this,item.text,Toast.LENGTH_LONG).show()
        }
    }
}