fun main() {
    // El proceso de creacion de un nuevo objeto de la clase se denomina instanciacion
    val smartTvDevice = SmartDevice()

    // Los metodos de la clase pueden ser accedidos por los objetos de la misma
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}

class SmartDevice {
    val name = "Android TV"
    val category = "Entertainment"
    val deviceStatus = "Online"

    /**
     * Metodos accesores
     * - El compilador de manera interna crea metodos get() y set(value) asociadas a cada propiedad de la clase.
     * - El metodo get() permite obtener el valor una propiedad mientras que el metodo set(value) permite modificarla
     * */
    var speakerVolume = 0
        get() = field
        set(value) {
            field = value
        }

    fun turnOn() {
        println("Smart device is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }
}