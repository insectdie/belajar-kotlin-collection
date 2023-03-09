package app

fun <T> displayCollection(collection: Collection<T>) {
    for (element in collection) {
        println(element)
    }
}

fun main() {
    displayCollection(listOf("Andry", "Ompusunggu"))
    displayCollection(setOf("Andry", "Ompusunggu"))
    displayCollection(mapOf("Andry" to  "Ompusunggu").entries)
}