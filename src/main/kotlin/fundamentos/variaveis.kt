package fundamentos

fun main() {
    var nome = "Guilherme"
    val nomeVal = "Guilherme"

    nome = "Daniel"
    //não pode - nomeVal = "Daniel"

    val idade = 23
    println(idade)
}

class variaveis {
    lateinit var teste: String

    fun iniciarVariaveis() {
        teste = "Teste"
    }
}