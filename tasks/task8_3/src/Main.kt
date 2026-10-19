// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val data = fetchData("temps.csv")
    
    val min = data.minBy{it.second}
    val max = data.maxBy{it.second}
    val avg = data.sumOf{it.second}/data.size

    println("Lowest temperature: ${min.first} with ${min.second}°C")
    println("Highest temperature: ${max.first} with ${max.second}°C")
    println("Average temperature: $avg°C")

}
