@file:JvmName("Main")

fun main() {
    var name: String = "arkyork"
    println(name.length)
    // null.kt:7:12: error: null can not be a value of a non-null type String
    // name = null
    // null非許容型にはnullを代入できない
    var nullableName: String? = "arkyork"
    nullableName = null
    // セーフコール演算子を利用
    println(nullableName?.length)
}