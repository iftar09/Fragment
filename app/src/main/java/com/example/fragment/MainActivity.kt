package com.example.fragment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, firstFragment)
            addToBackStack(null)
            commit()
        }

        val btnFirstFragment = findViewById<Button>(R.id.btnFirstFragment)

        btnFirstFragment.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, firstFragment)
                commit()
            }
        }


        val btnSecondFragment = findViewById<Button>(R.id.btnSecondFragment)

        btnSecondFragment.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, secondFragment)
                commit()
            }

        }

    }
}