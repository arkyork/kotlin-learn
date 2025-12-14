@file:JvmName("Main")
fun main() {
    val trggerFunc = ::trigger
    trggerFunc()
    val addFunc = add
    addFunc()
    repeat(8) { trggerFunc() }
}

fun trigger() {
    println("Triggered")
}

val add: () -> Unit = {
    println("Add function called") 
}