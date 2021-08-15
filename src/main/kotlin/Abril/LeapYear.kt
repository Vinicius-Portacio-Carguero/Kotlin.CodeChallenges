package Abril

fun main(){

    println(isLeapYear(2021))

}

fun isLeapYear(year: Int): Boolean{

    var x = 4
    var y = 100
    var z = 400

    if(year%x == 0) return true
    else if(year%y == 0) return false
    else if(year%z == 0) return true

    return false
}