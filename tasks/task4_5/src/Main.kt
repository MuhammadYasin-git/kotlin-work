// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Need the upper limit")
        exitProcess(1)
    }

    var upper_limit = args[0].toInt()
    var odd_sum = 0
    for (n in 1..upper_limit step 2) {
        println(n)
        odd_sum += n
    }
    println("The sum of all odd numbers is $odd_sum")

}
