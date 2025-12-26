
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

    println("---- Ramen Menu Sorted by Flavor ----")
    val alphabeticalMenu = ramenMenu.sortedBy { ramen ->
        ramen.flavor
    }
    alphabeticalMenu.forEach { ramen ->
        println("Ramen Flavor: ${ramen.flavor}, Price: $${ramen.price}")
    }
}