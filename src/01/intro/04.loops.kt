fun main() {
    // El bucle for permite iterar sobre un rango de valores o sobre una coleccion de elementos
    for (i in 1..10) {
        println(i)
    }

    // El bucle forEach permite iterar una coleccion de datos, tomando como parametro una funcion lambda
    var v1 = listOf(1,2,3,4,5)
    v1.forEach {
        println(it)
    }

    // El bucle forEachIndexed proporciona informacion del indice de cada elemento iterado
    v1.forEachIndexed { index, i ->
        println("Element at $index is $i")
    }
}