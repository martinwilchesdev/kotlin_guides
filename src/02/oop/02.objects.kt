fun main() {
    // El proceso de creacion de un nuevo objeto de la clase se denomina instanciacion
    val smartTvDevice = SmartDeviceObjectClass()

    // Los metodos de la clase pueden ser accedidos por los objetos de la misma
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}

class SmartDeviceObjectClass {
    val name = "Android TV"
    val category = "Entertainment"
    val deviceStatus = "Online"

    /**
     * Metodos accesores
     * - El compilador de manera interna crea metodos get() y set(value) asociadas a cada propiedad de la clase.
     * - El metodo get() permite obtener el valor una propiedad mientras que el metodo set(value) permite modificarla.
     * */
    var speakerVolume = 0
        /**
         * El valor de la propiedad get() o al actualizarlo en la funcion set(), se debe usar el campo de copia de seguridad "field".
         * La logica de los metodos get() y set() puede ser anulada modificando su codigo por defecto.
         * */
        get() = field
        set(value) {
            /**
             * El siguiente bloque de codigo anula al metodo set de la propiedad "speakerVolume", permitiendo modificar su valor
             * unicamente cuando se cumpla la condicion especificada.
             * */
            if (value in 1..100) {
                field = value
            }
        }

    fun turnOn() {
        println("Smart device is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }
}