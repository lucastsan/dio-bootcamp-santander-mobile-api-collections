package org.example.bootcamp.collections

fun main(){
    val lucas = Funcionario(nome = "Lucas", salario = 4000.0, contrato = "PJ")
    val nicole = Funcionario(nome = "Nicole", salario = 4500.0, contrato = "PJ")
    val lana = Funcionario(nome = "Lana", salario = 2000.0, contrato = "CLT")

    val funcionarios1 = setOf(lucas, nicole)
    val funcionarios2 = setOf(lana)
    val funcionarios3 = setOf(lucas, nicole, lana)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{println(it)}

    println("============================")

    val resultSubtract = funcionarios3.subtract(funcionarios1)
    resultSubtract.forEach{ println(it) }

    println("============================")

    val resultIntersect = funcionarios1.intersect(funcionarios3)
    resultIntersect.forEach{ println(it) }

}