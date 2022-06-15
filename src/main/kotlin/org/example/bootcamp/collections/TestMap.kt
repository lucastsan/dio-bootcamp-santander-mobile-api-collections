package org.example.bootcamp.collections

fun main () {
    val pair = Pair("Lucas",2000.0)
    val map1 = mapOf(pair)

    map1.forEach{(k, v) -> println("Chave: $k | Valor: $v")}

    println("============================")

    val map2 = mapOf(
        "Lucas" to 2000.0,
        "Nicole" to 3000.0,
        "Lana" to 1500.0,
    )

    map2.forEach { (k, v) -> println("Chave: $k | Valor: $v") }
}