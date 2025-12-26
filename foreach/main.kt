@file:JvmName("Main")

// defining a class for Ramen
class Ramen(
    val flavor: String,
    val price: Double
)

// Creating a list of Ramen objects
val ramenMenu = listOf(
    Ramen("Shoyu", 8.5),
    Ramen("Miso", 9.0),
    Ramen("Tonkotsu", 10.0),
    Ramen("Shio", 8.0)
)

fun main(){

    println("---- Ramen Menu ----")
    // Iterating through the list using forEach
    ramenMenu.forEach { ramen ->
        println("Ramen Flavor: ${ramen.flavor}, Price: $${ramen.price}")
    }
    println("---- Ramen Menu (using implicit it) ----")
    // iterating through the list using implicit it
    ramenMenu.forEach{
        println("Ramen Flavor: ${it.flavor}, Price: $${it.price}")
    }
}