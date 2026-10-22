// COMP2850 Portfolio: Week 3
// Functions for working with triangle geometry


import kotlin.system.exitProcess
import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(triangle: Triangle): Boolean{

    //Triple Collection split
    val (a,b,c) = triangle
    //each side length should be smaller than the sum of the other two side lengths
    if( (a >= b+c)||(b >= a+c)||(c >= b+a)){
        return false
    }
    
    //Valid Triangle
    return true
} 

fun triangleArea(triangle: Triangle): Double{
    //Triple Collection split
    val (a,b,c) = triangle
    require(isValidTriangle(triangle))
    //S calculation
    var s = (a + b + c)/2

    //Area calculation
    var area = sqrt(s*(s-a)*(s-b)*(s-c))
   
    //Area printed with 5 decimal point
    return area
}


