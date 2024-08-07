fun main() {
    /**
     * Cuando se declaran tipos de funciones, los parametros no se etiquetan, solo se especifica el tipo de dato de cada parametro.
     *      (String, Int) -> Int
     *
     * Cuando se define una expresion lambda para una funcion que toma un parametro, los parametros reciben nombres en el orden en el que ocurren.
     *
     * Los nombres de los parametros se muestran despues de las llaves de apertura y cada nombre esta separado por una coma.
     *
     * Una flecha "->" separa los nombres de los parametros del cuerpo de la funcion.
     *      val [function name] = { [parameter1, parameter2] ->
     *          [function body]
     *      }
     * */

    // Funcion lambda que recibe un parametro llamado quantity
    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }

    val cupcake: (Int) -> String = {
        "Have a cupcake"
    }

    val trickFunction = trickOrTreatParameters(true, coins)
    val treatFunction = trickOrTreatParameters(false, cupcake)
    trickFunction()
    treatFunction()
}

val trickParameter = {
    println("No treats!")
}

val treatParameter: () -> Unit = {
    println("Have a treat!")
}

/**
 * La funcion trickOrTreatParameters() recibe 2 parametros.
 * - Un valor booleano
 * - Una funcion
 *
 * La funcion trickOrTreatParameters() retorna una funcion que no recibe parametros y no retorna ningun valor
 * */
fun trickOrTreatParameters(isTrick: Boolean, extraTreat: (Int) -> String): () -> Unit {
    return if (isTrick) {
        println(extraTreat(0))
        trickParameter
    } else {
        println(extraTreat(100))
        treatParameter
    }
}