package com.example.test

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val spinner: Spinner = findViewById(R.id.spinner)
        ArrayAdapter.createFromResource(
            this, R.array.planets_to_go, android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }

        setContentView(R.layout.activity_main)
    }

    fun toRegistrationForm(view: View){
        val intent = Intent(this, ListActivity::class.java)
        startActivity(intent)
    }

    override fun onStart() {
        Log.i(TAG, "Main: Start")
        super.onStart()
    }

    override fun onResume() {
        Log.i(TAG, "Main: Resume")
        super.onResume()
    }

    override fun onPause() {
        Log.i(TAG, "Main: Pause")
        super.onPause()
    }

    override fun onStop() {
        Log.i(TAG, "Main: Stop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i(TAG, "Main: Destroy")
        super.onDestroy()
    }
}