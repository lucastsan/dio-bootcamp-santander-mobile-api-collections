package org.example.bootcamp.collections

fun main(){
    val salarios = doubleArrayOf(2500.0,3000.0, 2000.0, 5500.0, 4200.0)

    salarios.forEach { println(it) }

    println("============================")

    println("Maior Salario: ${salarios.maxOrNull()}")
    println("Menor Salario: ${salarios.minOrNull()}")
    println("Media Salarial: ${salarios.average()}")

    println("============================")

    val salariosMaioresQueMedia = salarios.filter { it > salarios.average() }

    salariosMaioresQueMedia.forEach { (println(it)) }

    println("============================")

    println("Quantidade de Salarios entre 3000 e 6000: ${salarios.count { it in 3000.0..6000.00 }}")
    println(salarios.find { it == 2000.0 })
    println("Existem salarios acima da media? : ${salarios.any { it > salarios.average() }}")

}