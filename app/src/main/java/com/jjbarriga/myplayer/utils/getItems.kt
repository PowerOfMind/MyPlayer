package com.jjbarriga.myplayer.utils

import com.jjbarriga.myplayer.utils.MediaItem.*

fun getItems(): List<MediaItem> = listOf(
        MediaItem("Title 2", "https://placekitten.com/200/200?image=2", Type.PHOTO),
        MediaItem("Title 3", "https://placekitten.com/200/200?image=3", Type.VIDEO),
        MediaItem("Title 4", "https://placekitten.com/200/200?image=4", Type.VIDEO),
        MediaItem("Title 5", "https://placekitten.com/200/200?image=5", Type.PHOTO),
        MediaItem("Title 6", "https://placekitten.com/200/200?image=6", Type.VIDEO),
        MediaItem("Title 7", "https://placekitten.com/200/200?image=7", Type.PHOTO),
        MediaItem("Title 1", "https://placekitten.com/200/200?image=1", Type.VIDEO),
        MediaItem("Title 8", "https://placekitten.com/200/200?image=8", Type.PHOTO),
        MediaItem("Title 9", "https://placekitten.com/200/200?image=9", Type.PHOTO),
        MediaItem("Title 10", "https://placekitten.com/200/200?image=10", Type.VIDEO)
)