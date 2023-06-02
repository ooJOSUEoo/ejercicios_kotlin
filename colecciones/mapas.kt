fun main(){
    println("Mapa")
    val ladas: Map<Int, String> = mapOf( // val ladas = mapOf(
        1 to "USA",
        34 to "España",
        52 to "Mexico",
        67 to "Colombia",
        70 to "Argentina"
    )    
    println(ladas)
    println(ladas[1])
    println(ladas.getOrDefault(99, "No existe"))
    println()

    ladas.forEach{(key, value) -> println("La clave lada de $value es $key")}
    println()

    println("La lada de Colombia es ${ladas.filter { it.value == "Colombia" }.keys.first()}")
    println()

    println("Tamaño: ${ladas.size}")
    println()

    println("Claves: ${ladas.keys}")
    println("Valores: ${ladas.values}")
    println("Entradas: ${ladas.entries}")
    println("Mapa vacio: ${ladas.isEmpty()}")
    println("Existe la 12: ${ladas.containsKey(12)}")
    println("Existe la 12: ${12 in ladas}")
    println("Existe Brazil: ${ladas.containsValue("USA")}")
    println("Existe Brazil: ${"USA" in ladas.values}")
    println()
    println()
    
    println("Mapa mutable")
    var nums = mutableMapOf(
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4
    )
    println("Numeros: $nums")
    nums.put("five", 5)
    println("Agregar 5: $nums")
    nums.remove("two")
    println("Quitar 2: $nums")
    nums["six"] = 6
    println("Agregar 6: $nums")
    nums = nums.toSortedMap()
    println("Ordenar: $nums")
    println()
    println()

    println("Ejercicio")

    val diccionarioSpaEng = mapOf(
        "one" to "uno",
        "apple" to "mansana",
        "cheese" to "queso",
        "car" to "automovil",
        "dog" to "perro",
        "cat" to "gato",
        "year" to "año",
        "man" to "hombre",
        "woman" to "mujer",
        "life" to "vida",
        "day" to "día",
        "night" to "noche"
    )

    fun mostrarDiccionario(diccionario: Map<String, String>) {
        diccionario.forEach {
            println("${it.key} - ${it.value}")
        }
    }

    fun buscarPalabra(diccionario: Map<String, String>, palabraSpa: String) {
        if (diccionario.containsValue(palabraSpa)) {
            println("Resultado: " + diccionario.filter { it.value == palabraSpa }.keys.first())
        }
    }

    println("Ingresar 1 para mostrar el diccionario o 2 para buscar una palabra")
    val opcion = readLine()!!.toInt()
    when (opcion) {
        1 -> mostrarDiccionario(diccionarioSpaEng)
        2 -> {
            println("Ingresar palabra en español")
            val palabraSpa = readLine()!!
            buscarPalabra(diccionarioSpaEng, palabraSpa)
        }
        else -> println("Opción no válida")
    }
}
