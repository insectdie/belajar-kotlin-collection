package app

data class Fruit(val name: String, val quantity: Int)

fun main() {
    val fruits = listOf(
        Fruit("Apple", 10),
        Fruit("Orange", 5)
    )
}