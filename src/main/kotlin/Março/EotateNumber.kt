package Março

fun main() {
   var n = 123456

    val nList : MutableList<String> = n
                                        .toString()
                                        .split("")
                                        .toMutableList()

    for(i in 1..nList.size - 2) {

        nList.set(nList.size - 2,
        nList[1]
            )

        nList.set(1,
            nList[i + 1]
        )

        println(nList)



    }

    println(nList)


}

//fun maxRot(n : Long) : Long {

//    n = 56789


//}