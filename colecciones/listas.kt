fun main(){
    
    val readOnly: List<String> = listOf("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo")

    println("Tamaño de la lista: ${readOnly.size}")
    println("Dato en posición 1: "+readOnly.get(1))
    println("Dato en primera posición: "+readOnly.first())
    println("Dato en última posición: "+readOnly.last())
    println()

    readOnly.forEach { println(it) }
    println()

    var mutableList: MutableList<String> = mutableListOf("enero", "febrero", "marzo", "abril")
    println(mutableList)
    mutableList.add("mayo")
    mutableList.add("junio")
    mutableList.add(1, "nuevo")
    println(mutableList)
    println()

    var emptyList: MutableList<String> = mutableListOf()
    println("Esta vacia? "+emptyList.none())
    println("Primer elemento: "+emptyList.firstOrNull())
    println("Último elemento: "+emptyList.lastOrNull())
    println("Elemento en la posición 2: "+emptyList.elementAtOrNull(2))
    println()

    readOnly.forEach{
        emptyList.add(it)
    }
    println(emptyList)
    println()

    //ordenar una lista de numeros enteros
    val numbers = listOf(1,8,5,7,4,6,3,2,9)
    val ordenados = numbers.sorted()
    println(ordenados)
    val descendentes = numbers.sortedDescending()
    println(descendentes)
    val pares = numbers.filter { it % 2 == 0 }
    println(pares)
    val numeroIgual2 = numbers.find { it == 2 }
    println(numeroIgual2)
    println()


}