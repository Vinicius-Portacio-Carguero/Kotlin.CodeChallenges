package agosto

fun main(){

     getCount("teste")

}

fun getCount(str: String): Int{
    val countVogal = mutableListOf<Int>(0)
    var vogal = mutableListOf("a","e","i","o","u")

    var strParsed = str.toMutableList()

    for(i in 0..strParsed.size - 1){

        val checkVogal = vogal.contains(strParsed[i].toString())

        if(checkVogal == true){
            val sum = countVogal[0] + 1

            countVogal.removeAt(0)
            countVogal.add(0,sum)

        }
    }

    return countVogal[0]

}