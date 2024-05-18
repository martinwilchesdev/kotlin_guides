fun main() {
    // La funcion `map()` permite convertir una coleccion en otra nueva con la misma cantidad de elementos.
    val fullMenu = cookies.map {
        "${it.name} - $${it.price}"
    }

    fullMenu.forEach {
        println(it)
    }
}