fun main(){
    //Случайное число
    val randomNumber = (1..10).random()

    do {
        println("Введите случайное число от 1 до 10:")
        val rand = readLine()?.toIntOrNull() ?: return println("Введено пустое значение")
        when {
            rand < randomNumber -> println("Требуется большее число.")
            rand > randomNumber -> println("Требуется меньшее число.")
            else -> println("Вы угадали число!")
        }
    } while (rand != randomNumber)
}