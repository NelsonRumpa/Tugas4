package com.example.tugas4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SampleList : AppCompatActivity() {
    lateinit var btnSList : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list)

        btnSList = findViewById(R.id.btnShowList)

        btnSList.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@SampleList,SampleListView::class.java)
            startActivity(intent)})
    }
}