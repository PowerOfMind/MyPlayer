package com.jjbarriga.myplayer

import android.content.Context
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

//fun add(x: Int, y: Int): Int = x + y

abstract class Person(name: String, age: Int)

class Developer(name: String) : Person(name, 20) {

}

fun test(view: View) {
    //val p = Person("Jhon", 30)
    //val d = Developer("Tom")
    when (view) {                                   //equivalente el switch de java, pero en cuanto una de las condiciones se cumple el resto no se ejecutan

        is TextView -> print(view.text)             //smart cast: casteo automatico si lo necesita
        is ViewGroup -> print(view.childCount)      //se pueden añadir llaves para meter mas condiciones
                                                    //else equivale al break del switch
        else -> print("Nothing found")
    }
    /*val result = when (view) {
        is TextView -> view.text.toString()
        is ViewGroup -> view.childCount.toString()

        else -> "Nothing found"
    }*/
}

fun pruebasApply(context: Context){
    val textView = TextView(context).apply {
        text = "hello"
        hint = "Goodbye"
        textSize = 25f
    }
    val textView2 = TextView(context)
        with(textView2){
            text = "hello"
        }
}


interface Logger {
    val tag: String
        get() = javaClass.simpleName

    fun logD(message: String) {
        Log.d(tag, message)
    }

    fun logE(message: String) {
        Log.e(tag, message)
    }
}




