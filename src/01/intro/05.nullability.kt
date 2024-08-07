fun main() {
    // En Kotlin se puede establecer una variable con el valor "null" para indicar que no tiene ningun valor inicial
    val v1 = null
    println(v1)

    /**
     * El operador "?" permite inicializar variables anulables.
     *
     * Las variables anulables permiten que durante la ejecucion del programa se les pueda asignar el valor "null".
     * */
    var v2: String? = "Martin"
    v2 = null
    println(v2)

    // El operador de llamada segura "?." permite que las variables anulables puedan acceder a metodos y propiedades
    println(v2?.length)

    /**
     * El operador de asercion no nula "!!." se utiliza principalmente para acceder a metodos y propiedades con variables
     * de las cuales se tiene la certeza que no tienen asignado un valor nulo
     * */
    val v3 = "Martin"
    println(v3!!.length)

    // El operador "?:" permite asignarle a una variable un valor opcional cuando se le intenta asignar un valor null
    val v4 = v2 ?: "Martin"
    println(v3)
}