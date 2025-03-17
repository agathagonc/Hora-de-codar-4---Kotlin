//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // Exercicio 1
    
    val estudantes = mutableListOf<String>() //lista estudantes
    var i = 0
    while(true){
        println("Digite o nome do estudante  ${i+1} ° :(Deseja parar? (digite PARE))")
        var nomeEstudante = readln()

        if (nomeEstudante.uppercase() == "PARE") {
            break
        }
        estudantes.add(nomeEstudante)
        i++
    }
    println("\nQuantidade de estudantes cadastrados: $i")

    println("Lista de estudantes:")
    for (estudante in estudantes) {
        println(estudante)
    }
}