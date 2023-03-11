package app

fun main() {
    val map: Map<Int, String> = mapOf(
        1 to "Andry",
        2 to "Halomoan",
        3 to "Ompusunggu"
    )

    val mapKeys = map.mapKeys { it.key * 10 }
    println(mapKeys)

    val mapValues = map.mapValues { it.value.toUpperCase() }
    println(mapValues)
}