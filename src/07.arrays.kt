fun main() {
    // Un array es una variable que puede almacenar mas de un valor
    var arr = arrayOf(1,2,3,4,5) // Arreglo de numeros enteros
    println(arr.contentToString()) // Convertir el contenido de un arreglo a un string

    var v1 = intArrayOf(100,200,300,400,500) // Arreglo de unicamente numeros enteros
    println(v1[0]) // Acceder al primer elemento del array

    v1[1] = 1000 // Modificar el valor del elemento ubicado en el indice 1 del array
    println(v1.contentToString())

    println(v1.size) // Contar la cantidad de elementos que contiene el array

    v1 += 2000 // Agregar un nuevo elemento al final del arreglo
    println(v1.contentToString())

    var v2 = intArrayOf(10,3,4,2,5,6)
    v2.sort() // Ordenar los valores contenidos en el arreglo
    println(v2.contentToString())

    var v3 = intArrayOf(1,2,3,4,4,5,5)
    val duplicates = v3.groupBy {it}.filter { it.value.size > 1 }.keys // Obtener los valores duplicados en un array
    println(duplicates)

    // Para remover un elemento de un array, el array mismo debe ser convertido primero en una lista mutable
    var v4 = v3.toMutableList()
    v4.remove(1)
    println(v4)
}