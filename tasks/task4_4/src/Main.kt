// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal


fun main(args: Array<String>){
    if (args.size != 3) {
        println("Needs 3 inputs. Initial temperature in Celsius; Maximum temperature in Celsius; Temperature increment")
        exitProcess(1)
    }
    val initial_temp = args[0].toFloat()
    val max_temp = args[1].toFloat()
    val increment_temp = args[2].toFloat()

    var x_celsius = initial_temp

    while(x_celsius <= max_temp){
        var x_fahrenheit = (x_celsius*(9/5)) + 32

        println("%8.1f %10.1f%n".format(x_celsius, x_fahrenheit))

        x_celsius = x_celsius + increment_temp
    }
    
}