fun main() {
    var v1: Double
    var v2: Double
    var res: Double

    // El bucle `while` se ejecuta mientras una condicion sea verdadera
    while (true) {
        try {
            println("Escribe el primer valor")
            v1 = readln().toDouble()
            println("Escribe el segundo valor")
            v2 = readln().toDouble()

            break // Finaliza la ejecucion del bucle cuando no se genera ningun error dentro del bloque `try`
        } catch (e: NumberFormatException) {
            println("Escribe un numero valido")
        }
    }

    res = v1 + v2
    println(res)
}