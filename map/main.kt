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
    // Using map to create a new list with modified prices
    println("---- Ramen Menu with Doubled Prices ----")
    val menuPriceUp = ramenMenu.map { ramen ->
        "Ramen Flavor: ${ramen.flavor}, Price: $${ramen.price * 2}"
    }
    for (item in menuPriceUp) {
        println(item)
    }
}