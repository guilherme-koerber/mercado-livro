package fundamentos

class MinhaClasse (var nome: String, var endereço: String, var idade: Int){
    companion object {
        fun criarComValoresPadrao(): MinhaClasse {
            return MinhaClasse("Guilherme", "Rua teste", 23)
        }

        fun criarAPartirDeSegundaClasse(segundaClass: SegundaClass): MinhaClasse {
            return MinhaClasse(segundaClass.nome, segundaClass.endereço, segundaClass.idade)
        }
    }

}

class SegundaClass (var nome: String, var endereço: String, var idade: Int){
    fun criarComValoresPadrao(): SegundaClass{
        return SegundaClass("Guilherme", "Rua teste", 23)
    }
}

fun main(){
    var segundaClass = SegundaClass("nome", "endereco", 10).criarComValoresPadrao()

    var minhaClasse = MinhaClasse.criarAPartirDeSegundaClasse(segundaClass)
}