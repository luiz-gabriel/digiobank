package main.kotlin.onebank.one.teste

import main.kotlin.onebank.one.Analista
import main.kotlin.onebank.one.Funcionario


fun main()
{
    val joao = Analista("João","999-999-999-99", 2000.0)

    ImprimeRelatorioFuncionario.imprime(joao)
}



