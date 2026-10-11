// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

//example to remember
//val person = Pair("Sarah", 37)

//val person2 = Triple("Joe", 24, 1.75f)
//val person = Pair("Sarah", 37)

//println(person.first)    // prints Sarah
//println(person.second)   // prints 37


import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(triangle: Triangle): Boolean{

    val Triple(a,b,c) = triangle
    if (a >= b+c)&&(b >= a+c)&&(c >= b+a){
        return false
    }
    

    return true
} 

fun triangleArea(triangle: Triangle): Double{
    import kotlin.system.exitProcess

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
    return area
}


