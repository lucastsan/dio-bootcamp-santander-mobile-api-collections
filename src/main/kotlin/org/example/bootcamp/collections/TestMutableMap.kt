package org.example.bootcamp.collections

fun main() {
    val lucas = Funcionario(nome = "Lucas", salario = 4000.0, contrato = "PJ")
    val nicole = Funcionario(nome = "Nicole", salario = 4500.0, contrato = "PJ")
    val lana = Funcionario(nome = "Lana", salario = 2000.0, contrato = "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(id = lucas.nome, value = lucas)
    repositorio.create(id = nicole.nome, value = nicole)
    repositorio.create(id = lana.nome, value = lana)

    println(repositorio.findById(lana.nome))

    println("============================")

    repositorio.findAll().forEach{ println(it) }

    println("============================")

    repositorio.remove(lucas.nome)
    repositorio.findAll().forEach{ println(it) }


}