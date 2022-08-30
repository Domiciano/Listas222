package edu.co.icesi.listas

import android.content.Intent
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import edu.co.icesi.listas.databinding.MyviewholderBinding

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val binding = MyviewholderBinding.bind(itemView)
    val nameTV = binding.name
    val phoneTV = binding.phone
    val actionBTN = binding.actionButton

    init {
        /*
        binding.actionButton.setOnClickListener {
            Toast.makeText(itemView.context, "Click", Toast.LENGTH_LONG).show()
            val intent = Intent(binding.actionButton.context, MainActivity2::class.java)
            itemView.context.startActivity(intent)
        }

         */
    }



}