package main.kotlin.onebank.one

class Pessoa {

    val name: String = "Luiz"
    var cpf: String = "111.000.222-33"
}

fun main()
{
    var bik = Pessoa()
    println(bik.name)
    println(bik.cpf)
}