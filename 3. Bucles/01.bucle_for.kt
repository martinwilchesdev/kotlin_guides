fun main() {
    // El bucle for es utilizado para iterar sobre un rango de valores o una coleccion de elementos (arreglos, listas, cadenas, etc)
    
    // Para recorrer un rango de numeros se utiliza el operador ".."
    for (i in 1..100) {
        println(i)
    }

    // El bucle for tambien se puede utilizar para tener acceso al indice de cada elemento
    val v1: List<String> = listOf("Apple", "Orange", "Banana")
    for (i in v1.indices) {
        println("item at ${i} is ${v1[i]}")
    }

    // Tambien se puede utilizar con conjuntos, mapas, etc
    val v2: Map<String, Int> = mapOf("a" to 1, "b" to 2, "c" to 3)
    for ((key, value) in v2) {
        println("${key} -> ${value}")
    }
}