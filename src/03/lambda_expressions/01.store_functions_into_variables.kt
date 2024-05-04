fun main() {
    /**
     * En Kotlin las funciones se pueden tratar como un tipo de dato.
     * Las funciones se pueden almacenar en variabes, pasarse a otras funciones como argumentos y mostrarse desde otras funciones.
     * */

    // Para hacer referencia a una funcion como una valor, se debe usar el operador de referencia "::" seguido del nombre de la funcion
    val value = ::trick
    println(value())
}

fun trick() {
    println("No treats!");
}