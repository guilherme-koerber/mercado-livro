package fundamentos

fun main() {
    println(retornaNome())
    dizOi("Guilherme", 23)
    dizOi(idade = 23, nome = "Gustavo")
    dizOi("Daniel")
}

fun retornaNome(): String {
    return "Guilherme"
}

fun dizOi(nome: String, idade: Int = 20) {
    println("Oi ${nome}, parabéns pelos seus ${idade} anos")
}