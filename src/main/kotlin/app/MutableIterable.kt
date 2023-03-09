package app

fun <T> displayMutableIterable(iterable: MutableIterable<T>) {
    val iterator = iterable.iterator()
    while (iterator.hasNext()) {
        val value = iterator.next()
        println(value)
    }
}

fun main() {
    displayMutableIterable(mutableListOf("Andry", "Halomoan", "Ompusunggu"))
    displayMutableIterable(mutableListOf("Andry", "Halomoan", "Ompusunggu"))
}