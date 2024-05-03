fun main() {
    // La herencia de clases permite que una clase (subclase) herede las propiedades y metodos de otra clase (superclase).
    var tv1 = SmartTvDevice("TV", "Entertainment")
    var lt1 = SmartLightDevice("Google Light", "Utility")
    lt1.turnOn()

    /**
     ** Relacion IS-A
     * La relacion IS-A entre una superclase y una subclase, especifica que cualquier tarea que pueda hacer la superclase
     * la subclase tambien la podra realizar.
     *      class SmartTvDevice(): SmartDevice() {}
     *          Relacion unidireccional, todos los SmartTvDevice son SmartDevice, pero no todos los SmartDevice son SmartTvDevice.
     * */
}

/**
 * En una clase superior se definen las propiedades y metodos comunes que podran ser heredados por otras clases.
 * La palabra clave "open" se utiliza para especificar que una clase podra ser extendida.
 * */
open class SmartDevice(val name: String, val category: String) {
    var deviceStatus = "Online"

    /**
     * Los metodos de la superclase pueden ser anulados desde la subclase.
     * La anulacion permite que se intercepte la accion, proporcionando su propia ejecucion.
     * La palabra clave "open" especifica que los metodos de la superclase podran ser anulados.
     * */
    open fun turnOn() {
        deviceStatus = "Online"
    }

    open fun turnOff() {
        deviceStatus = "Offline"
    }
}

// La definicion del constructor de la clase "smartTvDevice" pasa las propiedades recibidas al constructor de la superclase.
class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {
    var speakerVolume = 2
        set(value) {
            if (value in 1..100) {
                field = value
            }
        }

    var channelNumber = 1
        set(value) {
            if (value in 0..200) {
                field = value
            }
        }

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber")
    }
}

class SmartLightDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {
    var brightnessLevel = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel")
    }

    /**
     * Los metodos de la superclase que seran anulados desde la subclase, son antecedidos por la palabra clave "override".
     * La palabra clave "super" permite llamar al codigo definido en el metodo de la superclase.
     * El uso de la palabra clave es util para evitar la duplicidad de codigo, cuando varias subclases comparten logica similar.
     * */
    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("Smart Light turned off")
    }
}

/**
 ** Relacion HAS-A
 * La relacion HAS-A entre 2 clases se conoce como composicion.
 * Una clase contiene una referencia a otra clase mediante propiedades.
 */
class SmartHome(val smartTvDevice: SmartTvDevice, val smartLightDevice: SmartLightDevice) {
    fun turnOnTv() {
        smartTvDevice.turnOn()
    }

    fun turnOffTv() {
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume() {
        smartTvDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext() {
        smartTvDevice.nextChannel()
    }

    fun turnOnLight() {
        smartLightDevice.turnOn()
    }

    fun turnOffLight() {
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }

    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }
}