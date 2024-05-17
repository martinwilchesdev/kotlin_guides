fun main() {
    /**
     * Los conjuntos son colecciones que no tienen un orden especifico y no admiten valores duplicados.
     * Al ser colecciones sin un orden especifico, los elementos no son accedidos a traves de indices.
     * */
    val solarSystem = mutableSetOf("Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    // Al igual que `MutableList`, `MutableSet` tiene un metodo `add()`
    solarSystem.add("Pluto")

    // El tamaño del `set` es mostrado mediante la propiedad `size()`
    println(solarSystem.size)

    // La funcion `contains()` recibe un unico parametro y comprueba si el elemento especificado esta incluido en el `set`.
    println(solarSystem.contains("Pluto"))

    // Se puede usar el operador `in` para verificar si un elemento esta incluido en una coleccion.
    println("Pluto" in solarSystem)

    // La funcion `remove()` permite remover un elemento especifico del "set"
    solarSystem.remove("Mars")
}