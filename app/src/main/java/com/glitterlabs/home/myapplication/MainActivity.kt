package com.glitterlabs.home.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    public fun onBtnTouch(View v){
        TextView tv = (TextView) clearFindViewByIdCache (R.id.textView)
        tv.setText("Hello, World")
    }
}
