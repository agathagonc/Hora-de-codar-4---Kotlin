//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

// Exercicio 2

val planetas : MutableList<String> = mutableListOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno" ) //lista planetas

println("Digite o nome de planeta  ° :")
    
var planeta = readln()

if (planeta in planetas) {
    println("$planeta já consta na lista!")
}else{
    println("$planeta não consta na lista!")
}

println("Lista de planetas:")
for (planeta in planetas) {
    println(planeta)
}
}