fun main() {
    /**
     * Las expresiones lambda usan una sintaxis concisa para definir una funcion sin utilizar la palabra clave "fun".
     *
     * Las expresiones lambda pueden referenciarse directamente como un valor sin la necesidad de utilizar el operador de referencia "::".
     *
     * Cuando se define una funcion mediante una expresion lambda, se tiene una variable que hace referencia a la funcion,
     * por lo cual la invocacion de la funcion se realiza desde la variable que la almacena.
     * */
    val trickFunctionExpression = trickLambdaExpression
    trickFunctionExpression()
}

val trickLambdaExpression = {
    println("No treats!")
}