fun main() {
    /**
     * Al declarar una variable a menudo no es necesario especificar el tipo de dato que recibe de forma explicita.
     *
     * Los tipos de datos de las funciones consisten en un conjunto de parentesis que contienen una lista de parametros opcionales,
     * el simbolo "->" y el tipo de dato a retornar.
     *      ([parameters(optional)]) -> [return type]
     * */
    val treatDataType = treatDataType
    treatDataType()

    val treatFunction = trickOrTreat(true)
    val trickFunction = trickOrTreat(false)
    treatFunction()
    trickFunction()
}

// Funcion lambda con su tipo de dato definido de forma implicita.
val trickDataType = {
    println("No treats!")
}

// La siguiente funcion lambda declara su tipo de dato de forma explicita.
val treatDataType: () -> Unit = {
    println("Have a treat!")
}

// Una funcion se puede usar como cualquier otro tipo de dato, incluso se pueden mostrar funciones dentro de otras funciones.
fun trickOrTreat(isTtrick: Boolean): () -> Unit {
    return if (isTtrick) {
        trickDataType
    } else {
        treatDataType
    }
}