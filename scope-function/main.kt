@file:JvmName("Main")

fun main() {
    val q1 = Q<Int>(42, "What is the answer to life, the universe and everything?").apply {
        display()
    }
    val q2 = Q<String>("Kotlin", "What programming language is this?")

    // scope functions examples
    q1.let{
        println("Let: The answer to '${it.question}' is ${it.answer}.")
    }

    
}

class Q<T>(
    val answer: T,
    val question: String

){
    
    fun display() {
        println("The question starts ...")
    }
}
