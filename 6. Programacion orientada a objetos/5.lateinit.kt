package com.example.`class`

fun main() {
    val v1 = User("Martin")
    // La propiedad favouriteMovie es inicializada a traves de una instancia de la clase
    v1.favouriteMovie = "Interstellar"
    println(v1.favouriteMovie)
}

class User(firstName: String) {
    /**
     * Dentro de la clase es posible declarar variables y no asignarles un valor inmediatamente.
     * La palabra clave lateinit indica que la variable sera inicializada luego.
     * lateinit solo funciona en la declaracion de tipos de datos primitivos
     * */
    lateinit var favouriteMovie: String
}