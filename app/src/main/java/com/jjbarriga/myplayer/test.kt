package com.jjbarriga.myplayer

//fun add(x: Int, y: Int): Int = x + y

abstract class Person(name: String, age: Int)

class Developer(name: String) : Person(name, 20) {

}

fun test(){
    //val p = Person("Jhon", 30)
    val d = Developer("Tom")
}



