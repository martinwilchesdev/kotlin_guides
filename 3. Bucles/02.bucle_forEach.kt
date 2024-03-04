fun main() {
    // El bucle forEach se utiliza para iterar una coleccion de datos, tomando una funcion lambda como parametro, la cual es ejecutada por cada elemento en la coleccion
    
    // Si se tiene una lista de numeros y se quieren imprimir todos, se puede usar el bucle forEach
    val v1: List<Int> = listOf(1,2,3,4,5)
    v1.forEach {
        println(it)
    }

    // Tambien se puede utilizar una variable temporal para referirse al elemento actual en cada iteracion
    v1.forEach { number -> 
        println(number)
    }

    // El bucle forEach no proporciona acceso al indice del elemento. Si se necesita acceso al indice se puede utilizar el metodo forEachIndexed
    v1.forEachIndexed { index, number-> 
        println("Element at ${index} is ${number}")
    }
}