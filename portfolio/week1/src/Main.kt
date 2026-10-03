// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main (args: Array<String>){ //Main Function
    if (args.size < 3){ //Checking if less than three command line arguments
        println("Error: values for a, b, c required on command line") //error sentence
        exitProcess(1)
    }
    //will run with more than 3 but only use first 3 arguments
    val a = args[0].toFloat()
    val b = args[1].toFloat()
    val c = args[2].toFloat()

    //S calculation
    var s = (a + b + c)/2

    //Area calculation
    var area = sqrt(s*(s-a)*(s-b)*(s-c))

    //Area printed with 5 decimal point
    println("Area = %.5f".format(area))
}