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



}