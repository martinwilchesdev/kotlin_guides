fun main() {
    /**
    * Las funciones pueden tener parametros variables, lo que significa que pueden aceptar un numero variable de argumentos
    * Los parametros variables se indican con el caracter "*" antes del nombre del parametro
    */

    // La palabra clave vararg especifica un parametro variable llamado "numeros"
    fun imprimirNumero(vararg numeros: Int) {
        for (numero in numeros) {
            println(numero)
        }
    }

    // Al invocar la funcion se pueden pasar multiples numeros enteros como argumentos, los cuales seran recibidos como un arreglo de numeros enteros mediante vararg
    val v1 = imprimirNumero(1,2,3,4,5)

    // El operador spread "*" permite pasar una coleccion como argumentos individuales a una funcion con parametros variables
    val numeros = intArrayOf(1,2,3,4,5)
    val v2 = imprimirNumero(*numeros)
}