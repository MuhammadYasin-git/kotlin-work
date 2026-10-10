// Task 4.7: finding the longest line in a file
import kotlin.system.exitProcess
import kotlin.io.path.*

fun main(args: Array<String>){
    if (args.size != 1){
        println("Input Name of File")
        exitProcess(1)
    } 
    var filePath = Path(args[0])

    var longest = 0
    var length = -1
    var temp = 0
    var line_count = 0
    

    filePath.useLines {
        for (line in it){
            line_count++
            for (word in line){
                temp++
            }
            if (temp>length){
                length = temp
                temp = 0
                longest = line_count
            }
        }
    }

    println("Line $longest is the longest (length = $length)")
}