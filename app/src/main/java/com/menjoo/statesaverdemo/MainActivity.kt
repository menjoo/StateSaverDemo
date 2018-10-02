package com.menjoo.statesaverdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.evernote.android.state.StateReflection
import com.evernote.android.state.State

class MainActivity : AppCompatActivity() {

    @State
    var test1: Int = 0

    @StateReflection
    private var test2: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        test1++
        test2++
    }

    override fun onResume() {
        super.onResume()
        Log.i("TEST", "onResume mTest1=$test1 test2=$test2")
    }
}
