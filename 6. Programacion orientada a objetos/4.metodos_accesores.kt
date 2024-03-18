package com.example.`class`

fun main() {
    /**
     * El encapsulamiento es una de las caracteristicas principales de la programacion orientada a objetos,
     * permitiendo proteger el funcionamiento interno de una clase para que pueda o no ser accedida desde fuera de esta.
     * Los metodos accesores permiten acceder y modificar las propiedades de la clase.
     * - getters :: Permiten acceder al valor de una propiedad
     * - setters :: Permiten reasignar el valor de una propiedad
     *
     * ** Las propiedades de una clase nunca son accedidas directamente desde fuera de esta
     * ** Los metodos getters y setters en Kotlin son implicitos, se definen de forma automatica al declarar una propiedad
     * */

    val v1 = User("Martin")
    println(v1.firstName)
    v1.firstName = "Andrea"
    println(v1.firstName)
}

class User(firstName: String) {
    var firstName = firstName
        // La anulacion de los metodos accesores se debe realizar inmediatamente luego de la declaracion de la propiedad
        get() {
            /**
             * Para anular el metodo getter de una propiedad, se debe alterar el codigo de dicho metodo
             * En este caso el metodo getter de la propiedad firstName ya no retornara solo el nombre sino un prefijo adicional
             * */
            return "FirstName: $field"
        }
        set(value) {
            println(value)
            field = value
        }

    /**
     * La palabra clave field se utiliza dentro de los metodos accesores en lugar de la propiedad misma para evitar
     * una invocacion infinita del metodo accesor.
     * La palabra clave field solo puede ser utilizada dentro de los metodos accesores.
     * */
}