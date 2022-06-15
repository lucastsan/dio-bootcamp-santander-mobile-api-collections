package org.example.bootcamp.collections

data class Funcionario (
    val nome:String,
    val salario:Double,
    val contrato:String,
        ) {
    override fun toString(): String {
        return """
            Nome: $nome
            Salario: $salario
            Contrato: $contrato
        """.trimIndent()
    }
}