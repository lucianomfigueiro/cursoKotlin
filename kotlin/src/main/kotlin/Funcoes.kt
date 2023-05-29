import kotlin.math.*

fun main(){
    helloWorld()
    println("A soma de 10 e 5 é ${ sum(10, 5)}")
    println("A soma de 20 e 8 é ${ sum2(20, 8)}")
    println("Divisão: ${divisao(10f, 3.5f)}")

    //Funções de String
    val str = "Programação Kotlin"

    println("Tamanho da String: ${str.length}")
    println("String começa com Pro: ${str.startsWith("Pro")}")
    println("String termina com Pro: ${str.endsWith("abc")}")

    //Funções Matematicas

    println(max(2, 5))
    println(min(2, 5))
    println(sqrt(144f))
    println(PI)
    println(E)
    println(round(35555.66996))
}

fun sum2 (a: Int, b: Int): Int = (a + b) //Função de uma unica linha
fun sum(a: Int, b: Int): Int {
    return (a + b)
}
fun helloWorld(): Unit {
    println("Hello World")
}

fun divisao(a: Float, b: Float): Float = (a / b)