fun main() {
    /**
     * Las listas son colecciones redimensionables y ordenadas, por lo general implementadas como un arreglo que puede cambiar de tamaño.
     * Cuando el arreglo alcanza su capacidad maxima y se trata de insertar un nuevo elemento, el arreglo se copia en un nuevo arreglo mas grande.
     * En una lista tambien es posible insertar elementos nuevos entre otros elementos de un indice especifico.
     *
     * List :: Es una interfaz que define las propiedades y metodos relacionados con una coleccion de solo lectura.
     * MutableList :: Extiende la interfaz `List` con la definicion de metodos para modificar una lista.
     * */

    // La funcio listOf() recibe los elementos como parametros, mostrando un elemento `List` en lugar de un arreglo.
    val solarSystem = listOf("Mercury", "Venus", "Earth")

    // Obtener la cantidad de elementos que contiene una lista
    println(solarSystem.size)

    // Los elementos de una lista son accedidos mediante un indice especifico
    println(solarSystem[1])

    // La funcion indexOf() permite buscar el indice de un elemento especifico
    println(solarSystem.indexOf("Venus"))

    // Un bucle `for` permite iterar los elementos contenidos en una lista
    for (planet in solarSystem) {
        println(planet)
    }

    // La capacidad de agregar, quitar y actualizar elementos de una coleccion es exclusiva de las clases que implementan la interfaz `mutableListOf()`
    val fruits = mutableListOf("Orange", "Apple", "Banana")
    fruits.add("Watermelon")

    // Si la funcion `add()` recibe 2 parametros, el primer parametro sera el indice en el que se insertara el nuevo elemento.
    fruits.add(0, "Coconut")

    // Los elementos de una lista se quitan con el metodo remove() O removeAt()
    fruits.remove("Banana") // Se remueve el elemento indicado como parametro
    fruits.removeAt(1) // Se remueve el elemento ubicado en el indice especificado

    // El metodo `contains()` muestra un valor booleano dependiendo si un elemento existe o no en una lista.
    println(fruits.contains("Coconut"))

    // El opeardor `in` permite verificar de una forma concisa si un elemento esta en una lista, utilizando el elemento el operador in y la coleccion
    println("Onion" in fruits)
}