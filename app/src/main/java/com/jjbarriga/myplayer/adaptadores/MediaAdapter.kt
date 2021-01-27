package com.jjbarriga.myplayer.adaptadores

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jjbarriga.myplayer.R
import com.jjbarriga.myplayer.databinding.ViewMediaItemBinding
import com.jjbarriga.myplayer.utils.MediaItem
import com.jjbarriga.myplayer.utils.MediaItem.Type.*
import com.jjbarriga.myplayer.utils.inflate
import com.jjbarriga.myplayer.utils.loadUrl
import com.jjbarriga.myplayer.utils.toast
import kotlinx.android.synthetic.main.view_media_item.view.*

class MediaAdapter(val items: List<MediaItem>) : RecyclerView.Adapter<MediaAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = parent.inflate(R.layout.view_media_item)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)

    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        /*val title: TextView = view.findViewById(R.id.mediaTitle)
        val thumb: ImageView = view.findViewById(R.id.mediaThumb)
        val play: ImageView = view.findViewById(R.id.mediaVideoIndicator)*/
        private val binding = ViewMediaItemBinding.bind(view)       //accedemos a la vista


        fun bind(mediaItem: MediaItem) {
            with(binding) {         //funcion de scope sobre binding
                mediaTitle.text = mediaItem.title
                mediaThumb.loadUrl(mediaItem.url)
                //Glide.with(thumb).load(mediaItem.url).into(thumb)
                root.setOnClickListener {
                    toast(binding.mediaTitle.text.toString())
                }
                mediaVideoIndicator.visibility = when (mediaItem.type) {
                    PHOTO -> View.GONE
                    VIDEO -> View.VISIBLE
                }
            }


        }
    }
}

