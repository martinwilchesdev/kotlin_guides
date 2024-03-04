fun main() {
    /**
    * Los parametros son las variables que se pasan a una funcion al momento de invocarla
    * Los parametros tienen un nombre y un tipo especificado en la declaracion de la funcion
    */

    // Los parametros recibidos por la funcion son de tipo entero
    // El valor de retorno de la funcion es de tipo entero
    fun suma(a: Int, b: Int): Int {
        /**
        * Los valores de retorno son los valores que una funcion devuelve al momento de ser invocada
        * El tipo de retorno se especifica despues de los parametros
        */
        return a + b
    }

    // En caso de que una funcion no tenga un valor de retorno, se puede especificar la palabra clave Unit o simplemente no especificar ningun retorno
    fun saludar(): Unit {
        println("Hola Mundo")
    }

    // ** Es importante tener en cuenta que las funciones deben tener un valor de retorno especificado a menos que sean del tipo "Unit" o no especificar ningun tipo de retorno 

    suma(10, 20)
}