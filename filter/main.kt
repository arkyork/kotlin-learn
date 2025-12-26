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
    // Using filter to create a new list with prices greater than 8.5
    println("---- Ramen Menu with Prices > 8.5 ----")
    val menuPriceUp = ramenMenu.filter{ ramen ->
        ramen.price > 8.5}
    for (item in menuPriceUp) {
        println(item.flavor + ": $" + item.price)
    }
}