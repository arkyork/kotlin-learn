@file:JvmName("Main")

fun main(){
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val doubledNumbers = numbers.map { it * 2 }.toTypedArray()
    val appendedNumbers = numbers + doubledNumbers
    for (number in appendedNumbers) {
        println(number)
    }
}