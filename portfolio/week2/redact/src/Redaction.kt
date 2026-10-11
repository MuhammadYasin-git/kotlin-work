// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(text: String,redacted: String,replacement: Char = 'X'):String{

    //Split Document excluding redacted
    var split_text = text.split(redacted)

    val result = buildString{
        var i = 0  //counter
        while (i<split_text.size){ //loop while i less than size of split_text
            append(split_text[i]) //joining back parts
            if (i!=split_text.size-1){ //-1 so that replaced isnt added at end
                repeat(redacted.length){
                   append(replacement) //replacing redacted with replacement
                 }
            }
        i++ //increment
        }
        
    }

    return result

}
