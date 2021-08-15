package Março

//You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.
//
//#Examples:
//
//Kata.getMiddle("test") should return "es"
//
//Kata.getMiddle("testing") should return "t"
//
//Kata.getMiddle("middle") should return "dd"
//
//Kata.getMiddle("A") should return "A"
//#Input
//
//A word (string) of length 0 < str < 1000 (In javascript you may get slightly more than 1000 in some test cases due to an error in the test cases). You do not need to test for this. This is only here to tell you that you do not need to worry about your solution timing out.
//


fun main() {

    kata("middle")
}

fun kata(word : String) : String {

    var result: String = ""
    // Transform sentence in array
    val wordArray = word.split("")
    val wordSize = wordArray.size - 2

    if( wordSize % 2 == 0){

        val math = wordSize / 2
        val wordResult1 = wordArray[math]
        val wordResult2 = wordArray[math + 1]
        result = "$wordResult1$wordResult2"

    }else{
        val math = (wordSize + 1) / 2
        println(math)
        val wordResult1 = wordArray[math]

        result = "$wordResult1"
    }

    println(result)
    return result
}