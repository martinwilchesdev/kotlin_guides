fun main() {
    // A traves de la herencia una clase hija o subclase puede heredar las propiedades y metodos de una clase padre o suplerclase
    val car = Car("Ford Fiesta", "Red", 1, 4)

    // Las instancias de las clases Car y Plane pueden acceder a los metodos de la suplerclase Vehicle
    car.move()
    car.stop()

    val plane = Plane("Boeing 747", "White", 4, 2)
    plane.move()
    plane.stop()
}

/**
 * Las suplerclases o clases padres deben ser marcadas con la palabra clave open
 * Para definir que una clase hereda de otra, se utiliza la sintaxis `ChildrenClass(): ParentClass`
 * */
open class Vehicle(protected val name: String, val color: String) {
    /**
     * Los metodos de la superclase pueden ser sobreescritos dentro de las subclases que heredan
     * La palabra clave open se utiliza para especificar que un metodo podra ser sobreescrito en una subclase
     * */
    open fun move() {
        println("$name is moving")
    }

    fun stop() {
        println("$name is stopped")
    }
}

class Car(name: String, color: String, val engines: Int, val doors: Int): Vehicle(name, color) {}

class Plane(name: String, color: String, val engines: Int, doors: Int): Vehicle(name, color) {
    override fun move() {
        /**
         * El metodo move() de la clase padre es sobreescrito a traves de la palabra clave override
         * Dentro del metodo sobreescrito se invoca un nuevo metodo definido en la subclase
         * */
        flying()
        // super ejecuta la logica definida en el metodo de la superclase a la que invoca
        super.move()
    }

    private fun flying() {
        println("$name is flying")
    }
}