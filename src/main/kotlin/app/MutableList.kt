package app

fun main() {
    val mutableList : MutableList<String> = mutableListOf()

    mutableList.add("Andry")
    mutableList.add("Halomoan")
    mutableList.add("Ompusunggu")

//    mutableList[0] = "Budi"
//    mutableList.remove("Andry")

    for (value in mutableList) {
        println(value)
    }
}