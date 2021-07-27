package main.kotlin.onebank.one.teste

import main.kotlin.onebank.one.Banco

fun main()
{
    val digiOneBank = Banco("Digio", 12)
    val banco2 = digiOneBank.copy("Inter")
    println(digiOneBank.nome)
    println(digiOneBank.numero)

    println(banco2.nome)
    println(banco2.numero)

}