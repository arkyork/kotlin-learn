@file:JvmName("Main")

// Extension property to get double the value of an integer
val Int.getDouble: Int
    get() = this * 2

fun main() {

    val number = 5
    println("The double of $number is ${number.getDouble}")
}

