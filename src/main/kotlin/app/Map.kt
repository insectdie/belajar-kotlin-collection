package app

fun main() {
    val map: Map<String, String> = mapOf(
        Pair("a", "Andry"),
        "b" to "Halomoan",
        "c" to "Ompusunggu"
    )

    for ((key, value) in map) {
        println("$key to $value")
    }
}