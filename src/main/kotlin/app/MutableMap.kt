package app

fun main() {
    val mutableMap: MutableMap<String, String> = mutableMapOf()
    mutableMap.put("a", "Andry")
    mutableMap["b"] = "Halomoan"
    mutableMap["c"] = "Ompusunggu"

    println(mutableMap["a"])
    println(mutableMap.get("b"))
    println(mutableMap.get("c"))
    println(mutableMap.getOrDefault("d", "Tidak ada"))
    println(mutableMap["d"])

    mutableMap.remove("b")

    for ((key, value) in mutableMap) {
        println("$key to $value")
    }
}