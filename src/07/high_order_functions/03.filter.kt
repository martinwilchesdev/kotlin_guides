fun main() {
    // La funcion `filter()` permite crear un subconjunto a partir de una coleccion
    val softBakedMenu = cookies.filter {
        it.softBaked
    }

    println("Softed Cookies")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }
}