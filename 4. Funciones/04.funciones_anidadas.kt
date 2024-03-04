fun main() {
    /**
    * Las funciones pueden ser anidadas, lo que significa que una funcion puede ser definida dentro de otra funcion
    * Una funcion anidada tiene acceso a las variables y parametros de la funcio padre y puede ser llamada desde dentro de la funcion padre
    */

    // La funcion saludar() se encuentra anidada dentro de la funcion imprimirSaludo(), que a su vez esta anidada dentro de la funcion main()
    fun imprimirSaludo() {
        val saludo: String = "Hola Mundo"
        fun saludar() {
            println(saludo)
        }

        saludar()
    }

    // ** Las funciones tienen un ambito de bloque, lo que significa que solo estan disponibles dentro del codigo en el que se declararon
    println(saludo) // La variable saludo solo puede ser accedida desde dentro del bloque "{}" de la funcion en donde ha sido definida

    imprimirSaludo()
}