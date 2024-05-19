fun main() {
    /**
     * La funcion `groupBy()` permite convertir una lista en un mapa.
     * Cada valor unico que se muestra dentro del cuerpo de la funcion se convierte en la clave del mapa resultante.
     * Los valores de cada claves son todos los elementos de la coleccion que produjeron en valor unico asignado para cada clave.
     * */
    val groupedMenu = cookies.groupBy {
        it.softBaked
    }

    val softBakedMenu = groupedMenu[true] ?: emptyList()
    val crunchymenu = groupedMenu[false] ?: emptyList()

    println("Soft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }

    println()

    println("Crunchy cookies:")
    crunchymenu.forEach {
        println("${it.name} - $${it.price}")
    }
}