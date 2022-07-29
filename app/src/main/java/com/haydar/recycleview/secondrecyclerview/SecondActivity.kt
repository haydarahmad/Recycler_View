package com.haydar.recycleview.secondrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.haydar.recycleview.R
import com.haydar.recycleview.databinding.ActivityMainBinding
import com.haydar.recycleview.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val hpList = HpData.listHp
        binding.recyclerViewHp.adapter = HpAdapter(hpList)
        binding.recyclerViewHp.layoutManager = LinearLayoutManager(this)

    }

}