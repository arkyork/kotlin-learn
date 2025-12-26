@file:JvmName("Main")

fun main(){
    val numbers = listOf(1, 2, 3, 4, 5)
    println("numbers.size = ${numbers.size}")
    println("numbers[2] = ${numbers[2]}")
    println("numbers.get(3) = ${numbers.get(3)}")
    println("numbers.indexOf(4) = ${numbers.indexOf(4)}")
    println("---")
    val doubledNumbers = numbers.map { it * 2 }
    val appendedNumbers = numbers + doubledNumbers
    for (number in appendedNumbers) {
        println(number)
    }
}