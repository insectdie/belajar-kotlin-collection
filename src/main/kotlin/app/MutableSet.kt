package app

import data.Person

fun main() {
    val mutableSet : MutableSet<Person> = mutableSetOf()

    mutableSet.add(Person("Andry"))
    mutableSet.add(Person("Halomoan"))
    mutableSet.add(Person("Ompusunggu"))
    mutableSet.add(Person("Halomoan"))
    mutableSet.add(Person("Ompusunggu"))

    for (person in mutableSet) {
        println(person)
    }
}