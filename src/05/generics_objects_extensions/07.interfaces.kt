fun main() {
    /**
     * Las interfaces permiten especificar los metodos o las propiedades que debe incluir una clase.
     * Una interfaz se define con la palabra clave `interface` seguida de un nombre y llaves de apertura y cierre.
     *      interface [Interface name] {
     *          [interface body]
     *      }
     *
     * La clase debe implementar todas las propiedades y metodos especificados en la interfaz, lo cual asegura de que
     * cualquier clase que necesite extender la interfaz implemente exactamente las mismas propiedades y metodos.
     *
     * Si se modifica la interfaz, el compilador requerira que se actualice cualquier clase que extienda la interfaz.
     * */
    val q1 = InterfaceClassName()
    q1.printProgressBar()
}

interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}

class InterfaceClassName: ProgressPrintable {
    companion object StudentProgress {
        var answer = 9
        var total = 10
    }

    // A las propiedades y metodos extendidos desde la interfaz, se les debe anteponer la palabra clave `override`

    override val progressText: String
        get() = "$answer of $total answered"

    override fun printProgressBar() {
        println(progressText)
        repeat(answer) {
            print("▓")
        }
        repeat(total - answer) {
            print("▒")
        }
    }
}