fun main() {
    // Los bucles do while son similares a los bucles while, con la diferencia de que el cuerpo del bucle se ejecut al menos una vez antes de evaluar la condicion
    
    // Si se le quiere pedir al usuario que ingrese un numero entero positivo y asegurarse de que se cumpla esta condicion, se puede utilizar un bucle do while
    var v1: Int
    do {
        // El operador "!!" (casting no nulo) indica que el valor a la izquierda del operador no puede ser nulo y que el programa lance una excepcion si dicho valor es nulo
        v1 = readLine()!!.toInt()
        if (v1 <= 0) println("Ingrese un numero entero positivo")
    } while (v1 <= 0)
}