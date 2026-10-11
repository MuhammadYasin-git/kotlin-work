// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(text: String,redacted: String,replacement: Char = 'X'):String{

    var split_text = text.split(redacted)

    val result = buildString{
        var i = 0
        while (i<split_text.size){
            append(split_text[i])
            if (i!=split_text.size-1){
                repeat(redacted.length){
                   append(replacement)
                 }
            }
        i++
        }
        
    }

    return result

}
