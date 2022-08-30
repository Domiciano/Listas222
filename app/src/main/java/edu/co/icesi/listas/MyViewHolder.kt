package edu.co.icesi.listas

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import edu.co.icesi.listas.databinding.MyviewholderBinding

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val binding = MyviewholderBinding.bind(itemView)
    val nameTV = binding.name
    val phoneTV = binding.phone


}