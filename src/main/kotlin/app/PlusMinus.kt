package app

fun main() {
    val list1 = listOf("Andry", "Halomoan", "Ompusunggu")
    val list2 = list1 + "Programmer"
    println(list2)

    val list3 = list1 + listOf("Programmer", "UBS", "Insectdie")
    println(list3)

    val list4 = list1 - "Andry"
    println(list4 )

    val list5 = list1 - listOf("Andry", "Halomoan")
    println(list5)

    val map1 = mapOf("a" to "Andry", "b" to "Halomoan")
    val map2 = map1 + ("c" to "Ompusunggu")
    println(map2)
    val map3 = map1 - "a"
    println(map3)
}