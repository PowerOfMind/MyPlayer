package com.jjbarriga.myplayer

import android.view.View
import android.view.ViewGroup

object MyObject {
    val x = 20
    val y = "Hello"
}


fun test2() {

    MyObject.x
    MyObject.y
}

fun testViewGroup(viewGroup: ViewGroup){
    viewGroup.getChildAt(0)    //ORIGINAL
    viewGroup.size          //FUNCIONES DE EXTENSION
    viewGroup[0]
}

val ViewGroup.size: Int
    get() = childCount

operator fun ViewGroup.get(index:Int): View = getChildAt(index)