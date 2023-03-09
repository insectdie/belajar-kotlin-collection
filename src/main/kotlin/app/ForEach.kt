package app

fun main() {
    listOf("Andry", "Halomoan", "Ompusunggu").forEach {
        println(it)
    }

    mutableListOf("Andry", "Halomoan", "Ompusunggu").forEachIndexed { index, value ->
        println("$index : $value")
    }
}