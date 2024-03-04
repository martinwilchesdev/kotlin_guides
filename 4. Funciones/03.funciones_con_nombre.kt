fun main() {
    /**
    * Las funciones con nombre son aquellas que tienen un nombre especifico asignado a ellas
    * Estas funciones se utilizan para proporcionar un nombre significativo a un conjunto de instrucciones que realizan una tarea especifica
    */
    fun calcularAreaCirculo(radio: Double): Double {
        val pi = 3.14159265
        return pi * radio * radio
    }

    calcularAreaCirculo(5.678)
}