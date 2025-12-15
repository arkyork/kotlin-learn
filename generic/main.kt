@file:JvmName("Main")

fun main() {
    val q1 = Q<Int>(42, "What is the answer to life, the universe and everything?")
    val q2 = Q<String>("Kotlin", "What programming language is this?")

    println("Q1: ${q1.question} Answer: ${q1.answer}")
    println("Q2: ${q2.question} Answer: ${q2.answer}")
}

class Q<T>(
    val answer: T,
    val question: String
)