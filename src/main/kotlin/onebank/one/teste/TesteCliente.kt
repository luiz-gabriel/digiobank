package main.kotlin.onebank.one.teste

import main.kotlin.onebank.one.ClienteTipo
import main.kotlin.onebank.one.Cliente

    fun main() {
        val jose = Cliente(
            nome = "Jose Da Silva",
            cpf = "999-999-999-85",
            clienteTipo = ClienteTipo.PF,
            senha = "123"
        )

        println(jose)

        TesteAutenticacao().autentica(jose)
    }



