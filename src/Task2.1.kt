fun main() {
    print(" ")
    for (ones in 0..9) {
        print("     $ones  ")
    }
    println()

    for (tens in 1..9) {
        print("${tens}0")

        for (ones in 0..9) {
            val number = tens * 10 + ones
            if(number>1000)
                print("  ${number * number}  ")
            print("  ${number * number} \t")
        }

        println()
    }
}