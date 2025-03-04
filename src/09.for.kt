fun main() {
    // El ciclo `for` permite iterar un conjunto de datos
    for (i in 1..5) { // Iterar un rango de numeros entre 1 a 5
        println(i)
    }

    for (i in 'a'..'f') { // Iterar entre un rango de caracteres
        println(i)
    }

    val v1 = arrayOf("User1", "User2", "User3", "User4")
    for (i in v1) { // Iterar los elementos contenidos en un arreglo
        println(i)
    }

    for (i in v1.indices) { // Iterar los indices asociados a los elementos de un arreglo
        println("$i - ${v1[i]}")
    }
}