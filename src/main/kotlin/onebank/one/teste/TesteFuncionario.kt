package main.kotlin.onebank.one.teste

import main.kotlin.onebank.one.Funcionario
import main.kotlin.onebank.one.Pessoa
import java.math.BigDecimal

fun main()
{
    val joao = Pessoa("João","999-999-999-99")

    println(joao.nome)
    println(joao.cpf)

    val jether = Funcionario("Jether","999-999-999-99", BigDecimal.valueOf(2500.0))

    println(jether.nome)
    println(jether.cpf)
    println(jether.salario)
}