fun main() {
    // La palabra clave "break" se utiliza para detener la ejecucion de un bucle, siguiendo con la siguiente instruccion posterior al bucle
    // Se utiliza break para finalizar el bucle cuando el valor de la variable de iteracion es igual a 5
    for (i in 1..10) {
        if (i == 5) {
            break
        }
        println(i)
    }

    // La palabra clave "continue" se utiliza para saltar una iteracion en un bucle y se continua con la siguiente iteracion
    // Se utiliza continue para saltar las iteraciones en las que la variable de iteracion es un numero par
    for (i in 1..10) {
        if (i % 2 == 0) {
            continue
        }
        println(i)
    }
}