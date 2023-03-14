package app

fun main() {
    val words = "The quick brown fox jumps over the lazy dog".split(" ")
    val sequence = words.asSequence()

    val resultSequence = words
        .filter {
            println("filter $it")
            it.length > 3
        }
        .map {
            println("map $it")
            it.toUpperCase()
        }
        .take(4)

    println(resultSequence)
}