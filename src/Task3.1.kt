fun main() {
    //Калькулятор
    println("Введите делимое (a):")
    val a = readLine()?.toDoubleOrNull() ?: return println("Введено пустое значение")

    var b: Double
    do {
        print("Введите делитель (b): ")
        b = readLine()?.toDoubleOrNull() ?: 0.0
        if (b == 0.0) {
            println("Делитель не может быть равен 0")
        }
    } while (b == 0.0)

    val result = a / b
    println("$result")
}