fun main() {
    /**
     * El bloque try..catch permite capturar errores que ocurren durante la ejecucion del programa,
     * por ejemplo dividir por 0 o tratar de acceder a un elemento de un arreglo que no existe.
     * */
    val a = 5
    val b = 5

    try {
        // Si ocurre un error en alguna de las lineas de codigo del bloque try, dicho error es capturado por el bloque catch
        println(a / b)

        // Este codigo no se ejecuta, ya que cuando ocurre un error la ejecucion del codigo pasa al bloque catch
        println("Divide by 0")
    } catch(e: ArithmeticException) {
        println(e.message) // Se imprime el mensaje de la excepcion capturada // / by zero
    } finally {
        // El codigo del bloque finally es ejecutado ya sea que una excepcion sea lanzada o no
        println("Finally block")
    }

    // El bloque try..catch puede ser usado como una expresion asignando la ultima linea ejecutada a una variable
    val result = try {
        a / b
    } catch (e: ArithmeticException) {
        0
    }
    println(result)
}