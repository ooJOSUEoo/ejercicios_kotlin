fun main(){
    val a = 10
    val b = 5
    var c: Int

    println("Operadores: ")
    c = a.plus(b)
    println("$c = $a + $b")

    c = a.minus(b)
    println("$c = $a - $b")

    println(b.compareTo(a)>0)
    println("$a > $b = " + (a > b))

    println("a > b: ")
    println(a.compareTo(b)>0)

    println("b < a: ")
    println(b.compareTo(a)<0)

    println("a < b: ")
    println(a.compareTo(b)<0)

    println("a == b:")
    println(a.equals(b))

    println("a != b:")
    println(!a.equals(b))
}