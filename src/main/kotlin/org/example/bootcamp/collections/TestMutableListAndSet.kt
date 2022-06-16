package org.example.bootcamp.collections

fun main() {
    val lucas = Funcionario(nome = "Lucas", salario = 4000.0, contrato = "PJ")
    val nicole = Funcionario(nome = "Nicole", salario = 4500.0, contrato = "PJ")
    val lana = Funcionario(nome = "Lana", salario = 2000.0, contrato = "CLT")

    val funcionarios = mutableListOf(lucas, nicole)
    funcionarios.forEach { println(it) }

    println("============LIST===============")

    funcionarios.add(lana)
    funcionarios.forEach { println(it) }

    println("============================")

    funcionarios.remove(lucas)
    funcionarios.forEach { println(it) }

    println("============SET================")

    val funcionariosSet = mutableSetOf(nicole)
    funcionariosSet.forEach { println(it) }

    println("============================")

    funcionariosSet.add(lucas)
    funcionariosSet.add(lana)
    funcionariosSet.forEach { println(it) }

    println("============================")

    funcionariosSet.remove(nicole)
    funcionariosSet.forEach { println(it) }

}