fun main() {
    var list = listOf(1,2,3,4,5)

    // `forEach` permite iterar un conjunto de datos, por ejemplo una lista
    list.forEach {
        println(it)
    }

    // `forEachIndexed` permite acceder al indice de cada elemento dentro del conjunto de datos
    list.forEachIndexed { index, i -> println("$index - $i") }
}