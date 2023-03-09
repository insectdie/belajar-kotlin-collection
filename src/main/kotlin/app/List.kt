package app

fun main() {
    val list: List<String> = listOf("Andry", "Halomoan", "Ompusunggu")

    println(list[0])
    println(list[1])
    println(list[2])
    println(list.indexOf("Andry"))
    println(list.indexOf("Ompusunggu"))
    println(list.contains("Andry"))
    println(list.contains("Tidak ada"))
    println(list.containsAll(listOf("Andry", "Ompusunggu")))
}