@file:JvmName("Main")

fun main(){
    var days = mutableSetOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
    println("days.size = ${days.size}")
    days.add("Otherday")
    for (day in days) {
        println(day)
    }

}