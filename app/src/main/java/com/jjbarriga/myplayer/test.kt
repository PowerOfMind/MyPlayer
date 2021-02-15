package com.jjbarriga.myplayer

import android.content.Context
import android.util.Log
import android.widget.TextView

//fun add(x: Int, y: Int): Int = x + y

abstract class Person(name: String, age: Int)

class Developer(name: String) : Person(name, 20) {

}

/*fun test(view: View) {
    //val p = Person("Jhon", 30)
    //val d = Developer("Tom")
    when (view) {                                   //equivalente el switch de java, pero en cuanto una de las condiciones se cumple el resto no se ejecutan

        is TextView -> print(view.text)             //smart cast: casteo automatico si lo necesita
        is ViewGroup -> print(view.childCount)      //se pueden añadir llaves para meter mas condiciones
                                                    //else equivale al break del switch
        else -> print("Nothing found")
    }
    *//*val result = when (view) {
        is TextView -> view.text.toString()
        is ViewGroup -> view.childCount.toString()

        else -> "Nothing found"
    }*//*
}*/

fun test() {
    /*val sum: (Int, Int) -> Int = { x, y -> x + y }
    val mul = { x: Int, y: Int -> x * y }*/
    //val res = doOp(2, 3, ::sum)// 6
    /*val lazyVal by lazy{20}
    lazyVal.toString()*/

    //COLECCIONES
    val listOfInt = listOf(2, 4, 5, 6)  //emptyList() para lista vacia
    val listaVacia = emptyList<Int>()
    val result = listOfInt.filter { it % 2 == 0 }
            .map { it.toString() }
            .sorted()
    val set = setOf<Int>()   //similar a lista pero no permite repetir elementos

    val map = mapOf("a" to 1, "b" to 2)      //listado de pares, que no se lo que es (usa funcion infix)

    val newList = listaVacia + 3
    val listResult = newList + listaVacia

    //lista mutable ---- Se pueden editar y añadir elementos
    val mutable = mutableListOf(3, 2, 5)
    mutable.add(5)


    //TIPO ESPECIAL
    val sequence = listOfInt.filter { it % 2 == 0 }     //esto merece la pena cuando las operaciones
            .asSequence()                               //son complejas o la lista sea muy grande (tiene tiempo de ejecucuin)
            .map { it.toString() }                      //no es necesario usar el sort
            .toList()


    //FUNCIONES INFIX
    for (i in 0 until 10){  //esto es como un for normal, de 0 a 10
        TODO()
    }
    0 until2 10

}

//para crear funciones infix hay que poner esta palabra delante de la funcion
// esto se usa mucho en los pares
infix fun Int.until2(x: Int){}


fun sum(x:Int, y:Int):Int = x+y

fun doOp(x: Int, y: Int, op: (Int, Int) -> Int) = op(x, y)

fun pruebasApply(context: Context) {
    val textView = TextView(context).apply {
        text = "hello"
        hint = "Goodbye"
        textSize = 25f
    }
    val textView2 = TextView(context)
    with(textView2) {
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




