fun main() { //Покупка
    var purchaseAmount: Double
    var paymentAmount: Double

    do {
        print("Введите сумму покупки: ")
        purchaseAmount = readLine()!!.toDouble()

        print("Введите сумму, которую вы внесли: ")
        paymentAmount = readLine()!!.toDouble()

        if (paymentAmount < purchaseAmount) {
            val shortfall = purchaseAmount - paymentAmount
            println("Внесенная сумма недостаточна, недосдача ${"%.1f".format(shortfall)}")
        }
    } while (paymentAmount < purchaseAmount)

    if (paymentAmount == purchaseAmount) {
        println("Спасибо!")
    } else {
        val change = paymentAmount - purchaseAmount
        println("Возьмите сдачу: ${"%.1f".format(change)}")
    }

//Случайное число
    val randomNumber = (1..10).random()
    println("Введите догадку:")
    val rand = readLine()?.toIntOrNull() ?: return println("Введено пустое значение")

    do {

        when {
            rand < randomNumber -> println("Требуется большее число.")
            rand > randomNumber -> println("Требуется меньшее число.")
            else -> println("Вы угадали число!")
        }
    } while (rand != randomNumber)
}
