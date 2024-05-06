fun main() {
    /**
     * Al igual que otros tipos de datos, se pueden declarar los tipos de datos como funciones anulables.
     * Para declarar una funcion como anulable, se debe encerra el tipo de funcion entre parentesis seguido del simbolo "?" fuera del parentesis de cierre.
     *      ([parameters(optional)] -> [return type])?
     * */
    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }

    val trickFunction = trickOrTreatanulable(true, coins)

    // Al ser anulable el segundo parametro no es necesario proporcionar una funcion
    val treatFunction = trickOrTreatanulable(false, null)
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
            extraTreat(100)
        }
        treatanulable
    }
}