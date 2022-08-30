package edu.co.icesi.listas

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter : RecyclerView.Adapter<MyViewHolder>() {

    private val data = arrayListOf<MyModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.myviewholder, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val dataItem = data[position]
        holder.nameTV.text = dataItem.name
        holder.phoneTV.text = dataItem.phone
        holder.actionBTN.setOnClickListener {
            Toast.makeText(holder.itemView.context, "${dataItem.name}", Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun addItem(model: MyModel) {
        data.add(model)
        notifyItemInserted(data.lastIndex)
    }


}