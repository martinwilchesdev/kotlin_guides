fun main() {
    /**
     * Un arreglo es una secuencia de valores que tienen el mismo tipo de datos.
     * Un arreglo contiene valores llamados elementos u objetos.
     * Los elementos de un arreglo se ordenan con un indice, el cual permite su posterior acceso.
     *      val [variable name] = arrayOf<[data type]>([element1, element2, ...])
     *
     * La funcion `arrayOf()` toma los elementos del arreglo como parametros y muestra un arreglo del tipo que coincide con los parametros que se pasaron.
     * */

    // Ya que Kotlin utiliza la inferencia de tipo se puede omitir el nombre del tipo cuando se llama la funcion `arrayOf()`.
    val rockPlanets = arrayOf("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus")

    // Los elementos contenidos en 2 arreglos distintos pueden agruparse en un unico arreglo mediante el operador `+`
    val solarSystem = rockPlanets + gasPlanets

    // Los elementos de un arreglo pueden ser accedidos mediante su indice
    println(solarSystem[0])

    // Mediante el indice de un arreglo es posibe definir el valor de un elemento
    solarSystem[0] = "Namek"
    println(solarSystem[0])
}