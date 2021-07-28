package main.kotlin.onebank.one

class Analista(nome: String, cpf: String, salario: Double): Funcionario(nome, cpf, salario) {
    override fun calculaAuxilio(): Double = salario * 0.10
}