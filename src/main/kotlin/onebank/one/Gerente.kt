package main.kotlin.onebank.one

import main.kotlin.onebank.one.Funcionario

class Gerente(nome:String,
              cpf:String,
              salario:Double
): Funcionario(nome = nome, cpf = cpf, salario = salario) {
    override fun calculaAuxilio(): Double = salario * 0.5
}