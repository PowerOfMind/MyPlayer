package com.jjbarriga.myplayer.adaptadores

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jjbarriga.myplayer.R
import com.jjbarriga.myplayer.utils.MediaItem

class MediaAdapter(val items: List<MediaItem>): RecyclerView.Adapter<MediaAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
                .from(parent.context)
                .inflate(R.layout.view_media_item,parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int =items.size

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){

        val title: TextView = view.findViewById(R.id.mediaTitle)
        val thumb: ImageView = view.findViewById(R.id.mediaThumb)

        fun bind(mediaItem: MediaItem){
            title.text = mediaItem.title
            Glide.with(thumb).load(mediaItem.url).into(thumb)
        }
    }
}

