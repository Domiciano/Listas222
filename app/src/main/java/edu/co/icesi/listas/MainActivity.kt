package edu.co.icesi.listas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import edu.co.icesi.listas.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private val binding:ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val adapter:MyAdapter by lazy {
        MyAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        binding.myList.layoutManager = LinearLayoutManager(this)
        binding.myList.setHasFixedSize(true)
        binding.myList.adapter = adapter


        binding.addBtn.setOnClickListener {
            adapter.addItem(MyModel(UUID.randomUUID().toString(), "+57 311 000 00 00"))
        }
    }
}