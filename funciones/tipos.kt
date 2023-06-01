fun main(){
    val num1:Int = 10
    val num2:Int = 20
    border("*",20)
    val resultado = suma(num1,num2)
    println(resultado)
    border("*",15)
    slogan(resultado)
    resta(num1,num2)
    println("Valor maximo: " + max(num1,num2,25))
    println("Promedio: " + promedio(3,5,8))

}
//Funciones con parametros
fun border(c:String, l:Int){
    for (i in 1..l){
        print(c)
    }
    println()
}

fun suma (a:Int, b:Int):Int{
    return a+b
}


//lambdas
val slogan = {r:Any -> println(r) }

val resta = {a:Int, b:Int -> println(a-b)}

val max = {a:Int,b:Int,c:Int ->maxOf(a,b,c)}

val promedio: (Int, Int, Int) -> Float = { n1: Int, n2: Int, n3: Int -> (n1 + n2 + n3).toFloat() / 3 }
