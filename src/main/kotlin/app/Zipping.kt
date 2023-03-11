package app

fun main() {
    val list1: List<String> = listOf("Andry", "Halomoan", "Ompusunggus")
    val list2: List<String> = listOf("Gold", "D", "Roger")

    val list3: List<Pair<String, String>> = list1.zip(list2)
    println(list3)

    val list4: List<String> = list1.zip(list2){value1, value2 ->
        "$value1 $value2"
    }
    println(list4)
}