package com.example.movie3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CustomAdapter: RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    val titles = arrayOf("Codelia",
        "Suscribete",
        "Videos",
        "YouTube")

    val details = arrayOf("dkdkdk",
        "kotlin",
        "mama",
        "papa")

    val images = intArrayOf(R.drawable.hotel,
        R.drawable.mister,
        R.drawable.buenho,
        R.drawable.seven)


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup, false)
        return  ViewHolder(v)
    }

    override fun onBindViewHolder(viewholder: ViewHolder, i: Int) {
        viewholder.itemTitle.text = titles[i]
        viewholder.itemDetail.text = details[i]
        viewholder.itemImage.setImageResource(images[i])
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detal)
        }
    }
}