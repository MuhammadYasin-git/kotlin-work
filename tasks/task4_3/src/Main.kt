// Task 4.3: grade calculation using a when expression

import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main(args: Array<String>){
    if (args.size != 3) {
        println("Error: Three Inputs not given")
        exitProcess(1)
    }
    val result_1 = args[0].toDouble().roundToInt()
    val result_2 = args[1].toDouble().roundToInt()
    val result_3 = args[2].toDouble().roundToInt()

    var average = (result_1 + result_2 + result_3)/3

    val grade = when (average) {
    in 0..39   -> "Fail"
    in 40..69  -> "Pass"
    in 70..100 -> "Distinction"
    else       -> "?"
    }
    with(System.out) {
    println("Rounded Average: $average")
    println("Grade: $grade")
    }
}