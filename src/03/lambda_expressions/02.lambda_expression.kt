fun main() {
    /**
     * Las expresiones lambda usan una sintaxis concisa para definir una funcion sin utilizar la palabra clave "fun".
     * Las expresiones lambda pueden almacenarse directamente en una variables sin la necesidad de utilizar el operador de referencia.
     * Cuando se define una funcion mediante una expresion lambda, se tiene una variable que hace referencia a la funcion, por lo cual la invocacion de la funcion se realiza desde la variable que la almacena.
     * */
    val candyOrTrickFunction = candyOrTrick
    candyOrTrickFunction()
}

val candyOrTrick = {
    println("No treats!")
}