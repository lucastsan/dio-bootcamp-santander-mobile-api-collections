package org.example.bootcamp.collections

fun main () {
    val values = intArrayOf(
        1, 6, 8, 9, 54, 23, 11
    )

    values.forEach {
        println(it)
    }

    println("============================")

    values.sort()
    values.forEach {
        println(it)
    }

}