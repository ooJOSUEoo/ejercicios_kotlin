// kt     js
// val == const
// var == var/let
fun main() {
    val veces = 35
    val border = "*"

    printBorder(2)
    println("Hola mundo kotlin")
    printBorder(4, 10)
    println()
    println("En este programa el caracter del border es $border")
    println("Y se repite $veces veces")
}

fun printBorder(t: Int = 1, n: Int = 5) {
    when (t) {
        1 -> repeat(n) { print("*") }
        2 -> repeat(n) { print("%") }
        3 -> repeat(n) { print("+") }
        else -> repeat(n) { print("#") }
    }
    println()
}

// fun printBorder(n: Int = 5, b: String = "="){
//     repeat(n){
//         print(b)
//     }
//     println()
// }
