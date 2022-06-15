package org.example.bootcamp.collections

fun main (){
    val salarios = DoubleArray(size = 3)
    salarios[0] = 1500.00
    salarios[1] = 4500.00
    salarios[2] = 3000.00

    salarios.forEach { println(it) }
    println("============================")
    salarios.forEachIndexed{index,salario ->
        salarios[index] = salario * 1.1
        println(salarios[index])
    }

    val salarios2 = doubleArrayOf(3000.00, 2500.00, 6000.00)

    salarios2.sort()
    println("============================")

    salarios2.forEach { println(it) }


}