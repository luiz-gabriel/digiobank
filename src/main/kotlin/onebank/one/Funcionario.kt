package main.kotlin.onebank.one

import java.math.BigDecimal

abstract class Funcionario(
    val nome:String,
    val cpf:String,
    val salario: BigDecimal
): Pessoa(nome,cpf) {
    abstract fun calculaAuxilio();
}