fun main() {
    // Las funciones se declaran utilizando la palabra clave "fun"

    // Funcion que suma 2 numeros enteros e imprimi el resultado
    fun suma() {
        println(2 + 2)
    }

    // En Kotlin es posible declarar funciones de una sola linea, las cuales son conocidas como funciones lambda
    val sumaLambda = { println(2 + 2) }

    /**
    * Sobrecarga de funciones
        En Kotlin es posible definir multiples funciones con el mismo nombre pero con parametros de distintos tipos o una cantidad diferente de parametros.
    */
    val v1 = getMax(1, 5)
    val v2 = getMax('A', 'G')
}

fun getMax(a: Int, b: Int): Int{
    return if (a > b) a else b
}

fun getMax(a: Char, b: Char): Char {
    return if (a > b) a else b
}