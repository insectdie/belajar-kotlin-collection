package app

import data.Person

fun main() {
    val set: Set<Person> = setOf(
        Person("Andry"), Person("Halomoan"), Person("Ompusunggu"), Person("Halomoan"), Person("Ompusunggu")
    )

    println(set.size)
    println(set.contains(Person("Andry")))

    for (person in set){
        println(person)
    }
}