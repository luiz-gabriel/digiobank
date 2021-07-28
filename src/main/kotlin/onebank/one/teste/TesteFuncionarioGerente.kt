package main.kotlin.onebank.one.teste

import main.kotlin.onebank.one.Gerente

fun main()
{
    val maria = Gerente("Maria","999-999-999-99", 7000.0,"senha123")

    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)
}


