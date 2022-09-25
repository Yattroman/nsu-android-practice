package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ListActivity : AppCompatActivity() {

    private val TAG = "ListActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
    }

    override fun onStart() {
        Log.i(TAG, "List: Start")
        super.onStart()
    }

    override fun onResume() {
        Log.i(TAG, "List: Resume")
        super.onResume()
    }

    override fun onPause() {
        Log.i(TAG, "List: Pause")
        super.onPause()
    }

    override fun onStop() {
        Log.i(TAG, "List: Stop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i(TAG, "List: Destroy")
        super.onDestroy()
    }
}