package app

fun <T> displayMutableCollection(collection: MutableCollection<T>) {
    for (element in collection) {
        println(element)
    }
}

fun main() {
//    displayMutableCollection(listOf("Andry", "Ompusunggu"))
    displayMutableCollection(mutableListOf("Andry", "Ompusunggu"))
//    displayMutableCollection(setOf("Andry", "Ompusunggu"))
    displayMutableCollection(mutableListOf("Andry", "Ompusunggu"))
    displayMutableCollection(mutableMapOf("Andry" to  "Ompusunggu").entries)
//    displayMutableCollection(mapOf("Andry" to  "Ompusunggu").entries)
}