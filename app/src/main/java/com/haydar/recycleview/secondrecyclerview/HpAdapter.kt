package com.haydar.recycleview.secondrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.haydar.recycleview.databinding.HpItemBinding

import com.haydar.recycleview.firstrecyclerview.AnimalAdapter

class HpAdapter(private val hpList: List<HpModel>): RecyclerView.Adapter<HpAdapter.ListViewHolder>() {

    inner class ListViewHolder(private val itemBinding : HpItemBinding): RecyclerView.ViewHolder(itemBinding.root){
        fun bind(word:HpModel){
            itemBinding.hpText.text = word.title
            // pangill glide untuk load gambar
            Glide.with(itemView.context).load(word.image).into(itemBinding.imageHp)

        }
    }
    override fun getItemCount(): Int {
        return hpList.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val word = hpList[position]
        holder.bind(word)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= ListViewHolder(
        HpItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    )


}