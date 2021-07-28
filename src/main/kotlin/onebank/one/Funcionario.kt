package main.kotlin.onebank.one

import java.math.BigDecimal

abstract class Funcionario(
    nome:String,
    cpf:String,
    val salario: Double
): Pessoa(nome,cpf) {
    protected abstract fun calculaAuxilio(): Double

    override fun toString(): String = """
    Nome: $nome
    Cpf: $cpf
    Salario: $salario
    Auxilio: ${calculaAuxilio()}
""".trimIndent()
}

