fun main(){
    println("Valores de i: ")
    for (i in 1..10){
        println(i)
    }
    println()

    println("Letras: ")
    for (i in 'a'..'g' step 2){
        println(i)
    }
    println("Letras reversas: ")
    for(i in 'g' downTo 'a'){
        println(i)
    }

    println()
    println("Mascotas: ")
    val mascotas =arrayOf("Michi", "Tigre", "Puma", "Max", "Leo", "Goku")
    for (mascota in mascotas.indices){
        println("[$mascota, ${mascotas[mascota]}]")
    }

    println()
    println("Dividiendo un string en caracteres: ")
    for (letra in "Hola Mundo"){
        println(letra)
    }

}