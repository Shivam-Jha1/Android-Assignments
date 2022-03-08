package com.coder178.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    
        val fragment = Fragment_Two();
        val fragmentManager = supportFragmentManager
        val fragmnetTransaction = fragmentManager.beginTransaction()
        fragmnetTransaction.add(R.id.main_container,fragment)
        fragmnetTransaction.commit()
    }
}


