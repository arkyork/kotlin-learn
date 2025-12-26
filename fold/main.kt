
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
    val totalPrice = ramenMenu.fold(0.0) { total, ramen ->
        total + ramen.price
    }
    println("Total Price of All Ramens: $totalPrice")
}