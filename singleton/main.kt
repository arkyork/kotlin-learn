@file:JvmName("Main")


fun main() {
    val student1 = studentScore
    student1.name = "Alice"
    student1.score = 90
    println("Student1: Name=${student1.name}, Score=${student1.score}")
}

object studentScore {
    var name: String = ""
    var score: Int = 0
}