package app

fun main() {
    val map = mapOf(
        "a" to "Andry",
        "b" to "Halomoan",
        "c" to "Ompusunggu"
    )

    for ((key, value ) in map) {
        println("$key : $value")
    }

    map.forEach{ (key, value) -> println("$key : $value") }
}