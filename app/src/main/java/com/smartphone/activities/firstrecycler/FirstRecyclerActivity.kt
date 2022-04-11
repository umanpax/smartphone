package com.smartphone.activities.firstrecycler

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.smartphone.R
import com.smartphone.models.Smartphone

class FirstRecyclerActivity : AppCompatActivity() {

    private  var viewModel = FirstRecyclerViewModel()
    private lateinit var adapter: FirstRecyclerAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_recycler)
        initViews()
        initObservers()
        initData()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recycler_view_smartphone)
    }

    private fun initData() {
        viewModel.getSmartphones()
    }

    @SuppressLint("SetTextI18n")
    private fun initObservers() {
        viewModel.liveDataSmartphones.observe(this) { smartphones ->
            initRecycler(smartphones)
        }
    }

    private fun initRecycler(listSmartphone: ArrayList<Smartphone>) {
        adapter = FirstRecyclerAdapter(listSmartphone, this)
        val llm = LinearLayoutManager(this)
        llm.orientation = RecyclerView.VERTICAL
        recyclerView.visibility = View.VISIBLE
        recyclerView.layoutManager = llm
        recyclerView.adapter = adapter
    }

}