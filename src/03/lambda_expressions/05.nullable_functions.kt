fun main() {
    /**
     * Al igual que otros tipos de datos, se pueden declarar los tipos de datos como funciones anulables.
     *
     * Para declarar una funcion anulable, se debe encerrar el tipo de funcion entre parentesis seguido del simbolo "?" fuera del parentesis de cierre.
     *      ([parameters(optional)] -> [return type])?
     * */
    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }

    val trickFunction = trickOrTreatanulable(false, coins)

    // Al ser anulable el segundo parametro de "trickOrTreatanulable" no es necesario proporcionar una funcion
    val treatFunction = trickOrTreatanulable(true, null)
    trickFunction()
    treatFunction()
}

val trickanulable = {
    println("No treats!")
}

val treatanulable = {
    println("Have a treat!")
}

fun trickOrTreatanulable(isTtrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    return if (isTtrick) {
        trickanulable
    } else {
        if (extraTreat != null) {
            println(extraTreat(100))
        }
        treatanulable
    }
}