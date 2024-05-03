fun main() {
    /**
     * El objetivo principal del constructor es inicializar objetos y prepararlos para su uso.
     * Existen 2 tipos de constructores que pueden ser definidos en la clase.
     * - Constructor primario
     * - Constructor secundario
     * */

    // El valor de las propiedades de la clase inicializadas en el constructor, es definido durante el proceso de instanciacion.
    val smartTvDevice = SmartDeviceConstructoClass(name = "Android TV", category = "Entertainment")
}

/**
 * El constructor primario es definido en la firma de la clase.
 * Mediante el constructor primario de la clase es posible definir las propiedades de la misma.
 * Cada clase puede tener un unico constructor principal.
 * */
class SmartDeviceConstructoClass(val name: String, val category: String) {
    var deviceStatus = "Online"

    /**
     * Una clase puede tener varios constructores secundarios, los cuales pueden ser definidos con o sin parametros.
     * El constructor secundario de la clase tiene un cuerpo, el cual puede contener logica de inicializacion.
     * Si la clase tiene un constructor principal, cada constructor secundario debe inicializarlo.
     * El constructor secundario puede tener parametros opcionales, cuyo valor podra ser definido durante el proceso de instanciacion.
     * */
    constructor(name: String, category: String, statusCode: Int): this(name, category) {
        deviceStatus = when(statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

    fun turnOn() {
        println("Smart device is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }
}