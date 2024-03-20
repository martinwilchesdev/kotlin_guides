fun main() {
    /**
     * Singleton es un patron de diseño, con el cual se garantiza que una clase tenga una sola
     * instancia y proporciona un punto de acceso global a esa instancia unica.
     *
     * No importa cuantas veces se solicite una instancia de la clase, siempre se devolvera
     * la misma instancia.
     *
     * Los singleton son utiles cuando se necesita una unica instancia comportida en toda la aplicacion,
     * como una conexion a una base de datos.
     * */

    /**
     * Los propiedadades y metodos son accedidos por el Singleton mismo.
     * Sin importar cuantas veces se solicite siempre se devolvera la misma instancia.
     * */
    val instance = Database.getInstance()
    println(instance)
    val instance2 = Database.getInstance()
    println(instance2)
}

// El siguiente singleton permite instanciar la inicializacion de una base de datos
object Database {
    private var instance: Database? = null

    // El codigo del bloque init se ejecuta unicamente cuando se inicializa la instancia la primera vez
    init {
        println("Singleton initialized")
    }

    fun getInstance(): Database? {
        if (instance == null) {
            instance = Database
        }

        return instance
    }
}