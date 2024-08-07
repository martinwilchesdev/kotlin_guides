fun main() {
    /**
     * Al declarar una funcion mediante una expresion lambda, si esta solo tiene un parametro se puede omitir la definicion de este.
     *
     * Cuando la funcion solo tiene un parametro y no se proporciona su nombre, de forma implicita Kotlin le asigna el nombre "it".
     * */
    val coins: (Int) -> String = {
        "$it quarters"
    }
    println(coins(100))

    /**
     * Las expresiones lambda son solo literales de funcion, al igual que "0" es un literal de un numero entero o "Hello" un literal de string.
     *
     * Las expresiones lambda pueden ser pasadas directamente en el llamado de la funcion.
     *      functionName(parameter1, [lambda expression])
     * */

    // Cuando la expresion lambda es el ultimo parametro de una funcion, esta se puede colocar despues de la definicion de la funcion
    val trickFunction = trickOrTreatExpression { "$it quantity" }
    trickFunction()
}

val trickLambdaExpressionSimplified = {
    println("No treat!")
}

fun trickOrTreatExpression(extraTreat: (Int) -> String): () -> Unit {
    val extraTreatValue = extraTreat(200)
    println(extraTreatValue)
    return trickLambdaExpressionSimplified
}