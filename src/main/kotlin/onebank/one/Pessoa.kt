package main.kotlin.onebank.one

class Pessoa {

    val name: String = "Luiz"
    var cpf: String = "111.000.222-33"

    private set

    constructor()

    fun pessoaInfo() = "$name $cpf"
    /*
    inner class Endereco{
        var rua: String = "Rua teste"
    }
    */
}

fun main()
{
    var bik = Pessoa()

    println(bik.pessoaInfo())

    //println(bik.Endereco().rua)
}