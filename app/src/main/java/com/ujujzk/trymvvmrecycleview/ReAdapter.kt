package com.ujujzk.trymvvmrecycleview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ReAdapter(val nicePlaces: List<NicePlace>, val context: Context) : RecyclerView.Adapter<ReAdapter.ReViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReAdapter.ReViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)

    }

    override fun getItemCount() = nicePlaces.size


    override fun onBindViewHolder(holder: ReAdapter.ReViewHolder, position: Int) {

    }


    class ReViewHolder(val itemView: View) : RecyclerView.ViewHolder( itemView) {

    }
}