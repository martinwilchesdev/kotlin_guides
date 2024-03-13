fun main() {
    /**
    * Byte
        Tipo de dato numerico de 8 bits que puede almacenar valores entre -128 y 127.
        Se podria utilizar para almacenar el valor de una variable de tamaño reducido.
    */
    var v1: Byte = 100

    /**
    * Short
        Tipo de dato numerico de 16 bits que puede almacenar valores entre -32,768 y 32,767.
        Se podria utilizar para almacenar el valor de una variable de tamaño mediano.
    */
    var v2: Short = 10000

    /**
    * Int
        Es un tipo de dato numerico de 32 bits que puede almacenar valores entre -2,147,483,648 y -2,147,483,647.
        Se podria utilizar para almacenar el valor de una variable de tamaño grande, como el numero total de clientes en una base de datos.
    */
    var v3: Int = 200000

    /**
    * Long
        Es un tipo de dato numerico de 64 bits que puede almacenar valores entre -9,223,372,036,854,775,808 y -9,223,372,036,854,775,807.
        Se podria utilizar para almacenar el valor de una variable de gran tamaño, como el numero total de visitas en un sitio web.
    */
    var v4: Long = 1000000000000

    /**
    * Float
        Es un tipo de dato numerico de punto flotante de 32 bits.
        Se podria utilizar para almacenar el valor de una variable que representa un numero con decimales, como el precio de un producto.
    */
    var v5: Float = 9.99

    /**
    * Double
        Es un tipo de dato numerico de punto flotante de 64 bits.
        Se podria utilizar para almacenar el valor de una variable que representa un numero con decimales y requiere precision, como el calculo de una operacion matematica compleja.
    */
    var v6: Double = 3.14159265358979323846

    /**
    * Boolean
        Es un tipo de dato logico que solo puede almacenar 2 valores, verdadero o falso.
    */
    var v7: Boolean = true
    var v8: Boolean = false

    /**
    * Char
        Es un tipo de dato que representa un caracter Unicode
    */
    var v9: Char = 'a'

    /**
    * String
        Es un tipo de dato que representa una secuencia de caracteres.
    */
    var v10: String = "Karim"

    /**
    * Array
        Es un tipo de dato que representa una coleccion de elementos del mismo tipo.
    */
    var v11: Array = arrayOf(1,2,3,4,5)

    /**
    * Variables sin signo
        Las variables unicamente pueden contener valores positivos.

        Para definir una variable sin signo se debe especificar un caracter "u" al final del valor asignado
    */
    val v12: Byte = 120u
}