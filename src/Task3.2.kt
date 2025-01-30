fun main(){
    // Про вклад
    print("Введите начальную сумму вклада: ")
    val principal = readLine()?.toDoubleOrNull() ?: 0.0

    print("Введите процент годовых (в %): ")
    val annualRate = readLine()?.toDoubleOrNull() ?: 0.0

    if (principal <= 0 || annualRate <= 0) {
        println("Некорректные данные. Сумма и процент должны быть положительными.")
        return
    }

    var currentAmount = principal
    val targetAmount = 1_000_000.0
    var years = 0

    println("Год | Сумма на вкладе")
    while (currentAmount < targetAmount) {
        years++
        currentAmount += currentAmount * (annualRate / 100)
        println("$years | %.1f".format(currentAmount))
    }

    println("\nВы станете миллионером через $years лет.")
}