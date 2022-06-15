package org.example.bootcamp.collections

fun main () {
    val values = IntArray(size = 5)
    values [0] = 6
    values [1] = 1
    values [2] = 5
    values [3] = 3
    values [4] = 2

    for (i in values){
        println(i)
    }

    println("============================")

    for (i in values.indices){
        println(values[i])
    }

    println("============================")

    values.forEach { i ->
        println(i)
    }

    println("============================")

    values.sort()
    for (i in values){
        println(i)
    }


}