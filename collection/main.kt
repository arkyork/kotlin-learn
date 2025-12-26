@file:JvmName("Main")

fun main(){
    // Creating a map of days
    val daysMap = mapOf(
        "Mon" to "Monday",
        "Tue" to "Tuesday",
        "Wed" to "Wednesday",
        "Thu" to "Thursday",
        "Fri" to "Friday"
    )

    // Accessing elements
    println("daysMap.size = ${daysMap.size}")
    println("daysMap[\"Wed\"] = ${daysMap["Wed"]}")
    println("daysMap.get(\"Fri\") = ${daysMap.get("Fri")}")
    println("daysMap.keys = ${daysMap.keys}")
    println("daysMap.values = ${daysMap.values}")
}