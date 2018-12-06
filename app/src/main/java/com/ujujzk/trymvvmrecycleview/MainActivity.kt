package com.ujujzk.trymvvmrecycleview

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import android.support.v7.widget.RecyclerView
import android.support.design.widget.FloatingActionButton



class MainActivity : AppCompatActivity() {

    lateinit var mFab: FloatingActionButton
    lateinit var mRecyclerView: RecyclerView
    lateinit var mAdapter: ReAdapter
    lateinit var mProgressBar: ProgressBar

    lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mFab = findViewById(R.id.fab)
        mRecyclerView = findViewById(R.id.recycler_view)
        mProgressBar = findViewById(R.id.progress_bar)



        viewModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)



        viewModel.getNicePlaces()?.observe(this, object :Observer<List<NicePlace>>{
            override fun onChanged(t: List<NicePlace>?) {

            }
        })


    }
}
