//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


  //Exercicio 3

    val compras : MutableList<String> = mutableListOf("Uva", "Mamao", "Banana", "Laranja")
    do {
        println("$compras")

        println("Digite o nome de uma fruta :")
        var fruta = readln()

        if (fruta in compras) {
            compras.remove(fruta)

            println("$fruta removida da lista!")
        }else{
            println("$fruta indisponivel na lista!")
        }
    }while (compras.isNotEmpty())
    println("Lista de compras  finalizada!")


}