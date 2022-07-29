package com.haydar.recycleview.firstrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.haydar.recycleview.R
import com.haydar.recycleview.databinding.ActivityFirstBinding
import com.haydar.recycleview.databinding.AnimalItemBinding

class FirstActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animalList = AnimalModel(this).getAnimalList()
        binding.recyclerView.adapter = AnimalAdapter(animalList)
    }
}