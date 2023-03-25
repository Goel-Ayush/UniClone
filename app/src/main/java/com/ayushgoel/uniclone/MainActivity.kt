package com.ayushgoel.uniclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ayushgoel.uniclone.adapter.HomepageRVAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpRecyclerView()
    }

    private fun setUpRecyclerView(){
        val rview = findViewById<RecyclerView>(R.id.rv_main)
        val adapter = HomepageRVAdapter()
        rview.layoutManager = LinearLayoutManager(this)
        rview.adapter = adapter
    }
}
