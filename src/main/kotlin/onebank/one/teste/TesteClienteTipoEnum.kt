package main.kotlin.onebank.one.teste

import main.kotlin.onebank.one.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} ${elemento.descricao}")
    }

    ClienteTipo.values().forEach { it ->
        println("${it.name} $it")
    }

    val pf = ClienteTipo.PF
    println("${pf.name}  ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("${pj.name}  ${pj.descricao}")
}