package fundamentos

class Carro (var cor: String, val anoFabricacao: Int, val dono: Dono) {
}

data class Dono(var nome: String, var idade: Int) {

}

fun main() {
    var carro = Carro("Branco", 2024, Dono ("Guilherme", 23))

    println(carro.cor)
    carro.cor = "Preto"

    println(carro.cor)

    println(carro.dono.nome)
    carro.dono.nome = "Gustavo"

    println(carro.dono)
}