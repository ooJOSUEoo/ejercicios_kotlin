fun main(){
    val num1:Int = 10
    val num2:Int = 20
    border("*",20)
    val resultado = suma(num1,num2)
    println(resultado)
    border("*",15)
    slogan(resultado)
    resta(num1,num2)

}

fun border(c:String, l:Int){
    for (i in 1..l){
        print(c)
    }
    println()
}

fun suma (a:Int, b:Int):Int{
    return a+b
}

val slogan = {r:Any -> println(r) }

val resta = {a:Int, b:Int -> println(a-b)}