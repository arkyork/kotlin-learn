@file:JvmName("Main")

fun main() {
    val q1 = Q<Int>(42, "What is the answer to life, the universe and everything?", Difficulty.MEDIUM)
    val q2 = Q<String>("Kotlin", "What programming language is this?", Difficulty.EASY  )

    println("Q1: ${q1.question} Answer: ${q1.answer} (Difficulty: ${q1.difficulty})")
    println("Q2: ${q2.question} Answer: ${q2.answer} (Difficulty: ${q2.difficulty})")
}

enum class Difficulty {
    EASY,
    MEDIUM,
    HARD
}

class Q<T>(
    val answer: T,
    val question: String,
    val difficulty: Difficulty
)

