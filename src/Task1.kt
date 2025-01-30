// Конвертор температур
fun main() {
    println("Введите минимальную температуру (℃):")
    val minTemp = readLine()?.toIntOrNull() ?: return println("Введено пустое значение")

    println("Введите максимальную температуру (℃):")
    val maxTemp = readLine()?.toIntOrNull() ?: return println("Введено пустое значение")

    if (minTemp > maxTemp) {
        println("Минимальное значение превышает максимальное")
        return
    }

    println("Цельсий\tФаренгейт")
    println("---------------------")


    for (c in maxTemp downTo minTemp) {
        val f = c * 1.8 + 32
        println("$c\t$f")
    }


// Значение функции (а тут тоно вообще х1 и х1, а не x и у?)

    println("Введите значение a:")
    val a = readLine()?.toDoubleOrNull() ?: return println("Введено пустое значение")

    println("Введите значение b:")
    val b = readLine()?.toDoubleOrNull() ?: return println("Введено пустое значение")

    println("Введите значение x1:")
    val x1 = readLine()?.toDoubleOrNull() ?: return println("Введено пустое значение")

    println("Введите значение x2:")
    val x2 = readLine()?.toDoubleOrNull() ?: return println("Введено пустое значение")


    println("x1")
    val y = a * x1 + b
    println("y($x1) = $y")

    println("x2")
    if (a != 0.0) {
        val x = (x2 - b) / a
        println("x для y = $x2: $x")
    }
}