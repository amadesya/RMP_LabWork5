import kotlin.math.*

fun main(){

    println("Введите значение a:")
    val a = readLine()?.toDoubleOrNull() ?: return println("Введено пустое значение")

    println("Введите значение b:")
    val b = readLine()?.toDoubleOrNull() ?: return println("Введено пустое значение")

    println("Введите значение x1:")
    val x1 = readLine()?.toDoubleOrNull() ?: return println("Введено пустое значение")

    println("Введите значение x2:")
    val x2 = readLine()?.toDoubleOrNull() ?: return println("Введено пустое значение")


    val startPoint = min(x1, x2).toInt()
    val endPoint = max(x1, x2).toInt()

    for (i in startPoint..endPoint){
        val y = a * i + b
        println("y(${i}) = ${y}")
    }
}