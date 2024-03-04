fun main() {
    /**
    * Las funciones pueden tener parametros opcionales y valores por defecto
    * Los parametros opcionales son aquellos que no son necesarios para que la funcion se ejecute de forma correcta
    * Los valores por defecto son los valores que se le asignan a los parametros opcionales si no se especifica un valor al momento de invocar la funcion
    */

    // La funcion se ejecutara asi no se le pase ningun argumento cuando esta se invoca. Por defecto el valor del parametro v1 es 2
    fun suma(v1: Int = 2): Int {
        return 2 + v1
    }

    println(suma())
}