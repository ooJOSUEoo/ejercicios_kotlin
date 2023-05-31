fun main() {
    var nombre : String? = null;
    println("Imprimiendo el valor nulo de nombre:");
    println(nombre);
    // nombre = "Josue";
    // var longitud = nombre?.length ?: 0;
    // println("La longitud del nombre es: $longitud");

    try {
        println("nombre: $nombre");
    } catch(exeption: NullPointerException){
        println(exeption)
    } finally {
      println("Fin del programa");   
    }

    var longitud = -1
    try{
        longitud = nombre?.length?: -1;
    } catch(e: NullPointerException){
        longitud = 0;
    } finally {
        println("Valor de longitud: $longitud");
    }

}