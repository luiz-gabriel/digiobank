package main.kotlin.onebank.one

import main.kotlin.onebank.one.Funcionario

class Gerente(nome:String,
              cpf:String,
              salario:Double,
              val senha: String
): Funcionario(nome = nome, cpf = cpf, salario = salario), Logavel {
    override fun calculaAuxilio(): Double = salario * 0.5

    override fun login(): Boolean = "senha123" == senha
}