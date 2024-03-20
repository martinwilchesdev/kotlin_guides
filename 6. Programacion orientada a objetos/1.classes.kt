fun main() {
    /**
    * La programacion orientada a objetos permite representar entidades similares a objetos de la vida real
    * los cuales pueden tener estado y funcionalidad
    */

    // El proceso de creacion de un objeto a partir de una clase se denomina instanciacion
    val v1 = Car("Ford", "Fiesta")

    // Cada objeto de la clase tiene acceso a las propiedades y metodos publicos de la misma mediante la notacion de punto
    println(v1.name)
    println(v1.move())
}

/**
* Una clase es un molde mediante el cual se pueden construir multiples objetos con propiedades y metodos en comun
* Las variables en una clase se denominan propiedades
* Las funciones en una clase se denominan metodos
*/
class Car(name: String, model: String) {
    var name = name
    var model = model

    fun move() {
        // Para acceder a una propiedad dentro de un metodo se utiliza la palabra reservada this
        println("The car ${this.name} is moving")
    }
}