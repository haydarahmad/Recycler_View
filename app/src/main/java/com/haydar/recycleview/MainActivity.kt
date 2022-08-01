package com.haydar.recycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.haydar.recycleview.databinding.ActivityMainBinding
import com.haydar.recycleview.firstrecyclerview.FirstActivity
import com.haydar.recycleview.secondrecyclerview.SecondActivity
import com.haydar.recycleview.thirdrecyclerview.ThirdActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.firstRecyclerView.setOnClickListener {
            val intent = Intent(this,FirstActivity::class.java)
            startActivity(intent)
        }

        binding.secondRecyclerView.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        binding.thirdRecyclerView.setOnClickListener {
            val intent = Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }

    }
}