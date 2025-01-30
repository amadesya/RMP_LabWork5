fun main() {
    print(" ")
    for (ones in 0..9) {
        print("\t$ones\t")
    }
    println()

    for (tens in 1..9) {
        print(" $tens ")

        for (ones in 0..9) {
            val number = tens * 10 + ones
            print("${number * number}\t")
        }

        println()
    }





//таблица умножения
    for (i in 1..9) {
        for (j in 1..9) {
            print("${i * j} \t")
        }
        println()
    }
}