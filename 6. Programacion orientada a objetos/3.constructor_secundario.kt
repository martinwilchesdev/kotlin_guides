fun main() {
    /**
    * Al utilizar el constructor secundario, las instancias de la clase puede opcionalmente tener o no ciertos parametros.
    * Se instancian 2 objetos, uno de ellos incluye el valor de la propiedad age mientras que el otro la omite
    */
    val v1 = User("Jon", 30)
    println("Name: ${v1.name} - Age: ${v1.age}")

    val v2 = User("Ada")
    println("Name: ${v2.name} - Age: ${v2.age}")
}

// Cuando se utiliza un constructor primario, dentro de dicho constructor se pueden definir propiedades.
class User(val name: String) {
    var age = 0

    /**
    * En un constructor secundario solo se pueden definir parametros.
    * Mediante this es posible llamar a las propiedades del constructor primario.
    */
    constructor(name: String, age: Int): this(name) {
        // El valor del parametro age es asignado a la propiedad definida dentro de la clase, la cual es accedida mediante this.
        this.age = age
    }
}