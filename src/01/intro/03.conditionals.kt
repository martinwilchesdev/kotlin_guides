fun main() {
    // La estructura condicional "when" permite evaluar multiples condiciones
    val v1 = 100
    when(v1) {
        10 -> {
            // Bloque de codigo que se ejecuta si el valor de la expresion evaluada es igual a 10
        }
        100 -> {
            // Bloque de codigo que se ejecuta si el valor de la expresion evaluada es igual a 100
        }
        else -> {
            // Bloque de codigo que se ejecuta por defecto si no se cumple ninguna condicion previa
        }
    }
    println(v1)

    /**
     * Comunmente las estructuras condicionales son utilizadas como sentencias, lo cual permite
     * evaluar una expresion y ejecutar un bloque de codigo a partir del valor booleano obtenido.
     *
     * Las estructuras condicionales pueden definirse como expresiones, permitiendo a partir de la evaluacion realizada
     * asignar el ultimo valor del bloque ejecutado a una variable.
     * */
    val v2 = if(100 > 10) {
        100
    } else {
        10
    }
    println(v2)

    val v3 = when(v1) {
        10 -> "The value is 10 (Ten)"
        100 -> "The value is 100 (One Hundred)"
        else -> null
    }
    println(v3)
}