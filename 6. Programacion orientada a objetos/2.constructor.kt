fun main() {
    val v1 = Car("Ford", "Fiesta", 2023)
    v1.move()
    println(v1.model)
}

// El metodo constructor de una clase se ejecuta inmediatamente cada vez que se instancia un nuevo objeto
class Car(var name: String, model: String, var year: Int) {
    var model: String

    /**
    * Los parametros recibidos por el metodo constructor de una clase pueden ser manipulados mediante un bloque inicializador
    * El bloque inicializador se ejecuta de forma automatica cada vez que se instancia un nuevo objeto de la clase
    */
    init {
        if (year > 2020) {
            this.model = "$model New"
        } else {
            this.model = "$model Old"
        }
    }

    fun move() {
        println("The car ${this.name} is moving")
    }
}