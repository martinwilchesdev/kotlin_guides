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

    // Dentro de la estructura when se puede realizar la validacion de un rango
    val v4 = 54
    when(v4) {
        in 1..50 -> println("$v4 is between 1 and 50")
        in 51..100 -> println("$v4 is between 51 and 100")
        else -> println("$v4 doesn't belong to any range")
    }

    // Mediante la palabra clave `is` es posible evaluar el tipo de dato de un valor
    when(v4) {
        is Int -> println("$v4 is an integer")
        else -> println("The data type is not recognozible")
    }
}