// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

//example to remember
//val person = Pair("Sarah", 37)

//val person2 = Triple("Joe", 24, 1.75f)
//val person = Pair("Sarah", 37)

//println(person.first)    // prints Sarah
//println(person.second)   // prints 37

import kotlin.system.exitProcess
import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(triangle: Triangle): Boolean{

    val (a,b,c) = triangle
    if( (a >= b+c)||(b >= a+c)||(c >= b+a)){
        return false
    }
    

    return true
} 

fun triangleArea(triangle: Triangle): Double{
    
    //will run with more than 3 but only use first 3 arguments
    val (a,b,c) = triangle

    //S calculation
    var s = (a + b + c)/2

    //Area calculation
    var area = sqrt(s*(s-a)*(s-b)*(s-c))

    //Area printed with 5 decimal point
    return area
}


