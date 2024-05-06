fun main() {
    /**
     * Al declarar una variable a menudo no es necesario especificar el tipo de dato de dato de forma explicita.
     * Los tipos de funciones consisten en un conjunto de parentesis que contienen una lista de parametros opcionales, el simbolo "->" y un tipo de dato.
     *      ([parameters(optional)]) -> [return type]
     * */
    val treatDataType = treatDataType
    treatDataType()

    val treatFunction = trickOrTreat(true)
    val trickFunction = trickOrTreat(false)
    treatFunction()
    trickFunction()
}

val trickDataType = {
    println("No treats!")
}

// La siguiente funcion declara su tipo de dato de forma explicita.
val treatDataType: () -> Unit = {
    println("Have a treat!")
}

// Una funcion se puede usar como cualquier otro tipo de dato, incluso mostrando funciones dentro de otras funciones.
fun trickOrTreat(isTtrick: Boolean): () -> Unit {
    return if (isTtrick) {
        trickDataType
    } else {
        treatDataType
    }
}