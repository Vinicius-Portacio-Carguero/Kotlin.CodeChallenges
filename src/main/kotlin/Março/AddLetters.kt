package Março

fun main() {
    addLetters(listOf('a', 'b', 'c'))

}

fun addLetters(arr: List<Char>) : Char {


    var alphabet = "abcdefghijklmnopqrstuvwxyz"
        .split("")
        .toMutableList()

    var lista : MutableList<Int> = mutableListOf()

    for (i in 0..arr.toMutableList().size - 1 ) {

        var index =  alphabet.indexOf(arr.toMutableList()[i])

        lista.add(
            0,
            index
        )
    }

    var listaSize = lista.sum()

    while ( listaSize > alphabet.size) {
        listaSize = lista.sum() - alphabet.size
    }

    println(alphabet[listaSize])

    return alphabet[listaSize].single()
}
