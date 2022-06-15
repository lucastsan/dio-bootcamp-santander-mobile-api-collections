package org.example.bootcamp.collections

fun main(){
    val nomes = Array(size = 3){""}
    nomes[0] = "Teobaldo"
    nomes[1] = "Pedro"
    nomes[2] = "Joao"

    nomes.forEach {
        println(it)
    }

    println("====================")

    nomes.sort()
    nomes.forEach { println(it) }

    println("====================")

    val nomes2 = arrayOf("Louise", "Camila", "Lorena")

    nomes2.forEach { println(it) }
}