@file:JvmName("Main")

// Extension function to check if an integer is even
fun Int.isEven(): Boolean {
    return this % 2 == 0
}

fun main() {
    val number = 4
    if (number.isEven()) {
        println("$number is even")
    } else {
        println("$number is odd")
    }
}