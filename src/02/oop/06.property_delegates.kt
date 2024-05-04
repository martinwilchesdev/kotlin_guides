import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun main() {
    /**
     * Las propiedades en Kotlin usan un campo de copia de seguridad para contener su valores en la memoria usando el identificador "field" para dicho fin.
     * La sintaxis para crear delegados de propiedad comienza con la declaracion de una variable, seguida por la palabra clave "by" y el objeto delegado de controla las funciones de metodos "get" y "set".
     *      var [variable] by [delegate object]
     *
     * * Interfaces
     * Contrato que deben cumplir las clases, las cuales se centrarn en que hacer en lugar de como hacer la accion.
     *      interface [Name] {
     *          [body]
     *      }
     * */
}

class RangeRegulator(initialValue: Int, private val minValue: Int, private val maxValue: Int) : ReadWriteProperty<Any ?, Int> {
    private var fielData = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fielData
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minValue..maxValue) {
            fielData = value
        }
    }
}

// El delegado de propiedad permite que se asgine la misma logica a diferentes propiedades en distintas clases que la accedan, lo cual disminuye la duplicidad de codigo

class SmartRadioDevicePropertyDelegate {
    private var speakerVolume by RangeRegulator(2, 0, 100)
}

class SmartTvDevicePropertyDelegate {
    private var speakerVolume by RangeRegulator(2, 0, 100)
}