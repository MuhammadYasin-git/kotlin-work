// Task 4.2: use of if and ranges


fun main() {
    // add your code here

    println("Choose your pizza options")
    println("a, b, c, d: ")


    val user_input = readln().lowercase()


    if (user_input[0] in 'a'..'b')  {
         println("Order accepted")
    } 
    else {
    println("Invalid choice!")
    }
}
