fun main() {
    /**
     * `Map` es una coleccion que consta de pares clave-valor.
     * Las claves de un mapa son unicas, sin embargo los valores no lo son.
     * Los mapas se pueden declarar con las funciones `mapOf()` y `mutableMapOf()`, requiriendo 2 tipos genericos separados por coma.
     *      mutableMapOf<[key type], [value type]>()
     *
     * Un mapa puede usar la inferencia de tipo si tiene valores iniciales.
     * Para propagar un mapa con valores iniciales, cada par clave-valor consta de la clave, seguido del operador `to` y el valor.
     *      val [map name] = mapOf(
     *          [key] to [value]
     *      )
     * */
    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 0,
        "Mars" to 0
    )

    // La propiedad `size` contiene la cantidad de pares clave-valor
    println(solarSystem.size)

    // La sintaxis de subindice permite acceder o modificar el valor de una clave
    println(solarSystem["Earth"])
    solarSystem["Earth"] = 1

    // El metodo `remove()` quita el par clave-valor de la clave especificada
    solarSystem.remove("Mars")
}