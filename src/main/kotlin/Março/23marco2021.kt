package Março


// Write a function that takes in a string of one or more words,
// and returns the same string, but with all five or more letter
// words reversed (Just like the name of this Kata). Strings passed
// in will consist of only letters and spaces. Spaces will be included
// only when more than one word is present.
//
// Examples:
//
// spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
//
// spinWords( "This is a test") => returns "This is a test"
//
// spinWords( "This is another test" )=> returns "This is rehtona test"


fun spinWords(sentence: String): String {

    val array: MutableList<String> = sentence
        .split(" ")
        .toMutableList()

    for(i in 0..array.size - 1){
        if(array[i].length >= 5){
            array.set(i, array[i].reversed())
        }
    }
    return array
        .joinToString(separator = ",")
        .replace(",", " ")
}

fun main() {
    spinWords("example sentence")
}