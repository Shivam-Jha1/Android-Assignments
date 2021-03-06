package com.coder178.custom_adaptor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var expensesList: ListView
    private val expenses = ArrayList<Expense>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val total = findViewById<TextView>(R.id.total)
        with(expenses) {
            add(Expense("Groceries", 5000f))
            add(Expense("Transportation", 8000f))
            add(Expense("Rent", 50000f))
            add(Expense("Cell Phone", 800f))
            add(Expense("Utility Bills", 6500f))
            add(Expense("Insurance", 5000f))
        }

        expensesList = findViewById(R.id.expenses_lists)
        val expenseAdapter = CustomExpenseAdapter(this, expenses)
        expensesList.adapter = expenseAdapter


        total.text = Expense.total(expenses)
    }
}