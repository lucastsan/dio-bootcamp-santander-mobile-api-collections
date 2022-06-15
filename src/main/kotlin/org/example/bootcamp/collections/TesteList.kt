package org.example.bootcamp.collections

fun main () {
    val lucas = Funcionario(nome = "Lucas", salario = 4000.0, contrato = "PJ")
    val nicole = Funcionario(nome = "Nicole", salario = 4500.0, contrato = "PJ")
    val lana = Funcionario(nome = "Lana", salario = 2000.0, contrato = "CLT")

    val funcionarios = listOf(lucas,nicole,lana)

    funcionarios.forEach{println(it)}

    println("============================")

    println(funcionarios.find { it.nome == "Nicole" })

    println("============================")

    println(funcionarios.sortedBy { it.salario }.forEach { println(it) })

    println("============================")

    println(funcionarios.groupBy { it.contrato }.forEach { println(it) })
}

