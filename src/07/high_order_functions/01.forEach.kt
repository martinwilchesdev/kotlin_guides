fun main() {
    // La funcion `forEach()` ejecuta la funcion pasada como parametro una vez por cada elemento de la coleccion
    cookies.forEach {
        println("Menu item is: ${it.name}")
    }
}

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        "Chocolate Chip",
        false,
        false,
        1.69
    ),
    Cookie(
        "Banana Walnut",
        true,
        false,
        1.59
    ),
    Cookie(
        "Vanilla Creme",
        false,
        true,
        1.49
    )
)