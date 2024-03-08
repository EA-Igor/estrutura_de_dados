package PilhaInvertida

fun main() {
    var pilha: Empilhavel = PilhaEstaticaInvertida(7)
    pilha.empilhar("Instituto")
    pilha.empilhar("Federal")
    println("Topo: ${pilha.espiar()}")
    pilha.empilhar("de")
    pilha.empilhar("Educação")
    pilha.empilhar("Ciência")
    pilha.empilhar("e")
    println("Topo: ${pilha.espiar()}")
    val conteudo = pilha.desempilhar()
    pilha.desempilhar()
    pilha.empilhar("Tecnologia")
    pilha.empilhar("da")
    pilha.empilhar("bahia")
    pilha.atualizar("Bahia")
    pilha.empilhar(pilha.desempilhar())
    pilha.empilhar(conteudo)
    println("Pilha=${pilha.imprimir()}")
}