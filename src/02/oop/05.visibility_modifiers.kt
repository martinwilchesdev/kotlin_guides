fun main() {
     /**
      * Los modificadores de visibilidad son la caracteristica principal que permite lograr el encapsulamiento en una clase.
      * Kotlin ofrece 4 modificadores de visibilidad.
      * - public :: Las propiedades y metodos pueden ser accedidos desde fuera de la clase.
      * - private :: Las propiedades y metodos solo podran accederse desde dentro de la clase a la que pertenecen.
      * - protected :: Las propiedades y metodos pueden ser accedidas desde subclases.
      * - internal :: Las propiedades y metodos pueden ser accedidas desde dentro del mismo modulo.
      * ** Un modulo es una coleccion de archivos y configuraciones que permiten dividir el proyecto en unidades funcionalidades.
      * */
}

open class SmartDeviceVisibilityClass {
    /**
     * Al definir una clase, sus propiedades y metodos por defecto son visibles de forma publica.
     *
     * Para modificar la visibilidad de una propiedad, se especifica el modificador seguido de la sintaxis que define la propiedad.
     * */
    private var deviceStates = "Online"
    var speakerVolume = 2
    protected set(value) {
        // Los modificadores de visibilidad tambien pueden ser configurados para el metodo set() de una clase
        if (value in 0..100) {
            field = value
        }
    }

    // Los modificadores de visibilidad tambien pueden ser especificados para metodos de la clase
    private fun turnOn() {
        println("Smart device turned on.")
    }
}