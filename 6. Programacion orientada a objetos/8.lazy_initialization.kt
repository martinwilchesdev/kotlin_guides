fun main() {
    // La inicializacion peresoza se utiliza cuando la creacion de una instancia tomara tiempo
    val u1 = User("Jon", "Doe", 30)

    // La inicializacion peresoza de una instancia se realiza mediante la siguiente sintaxis, utilizando by lazy
    val u2 by lazy {
        User("Ada", "Lovelace", 40)
    }

    // La instanciacion del objeto inicializado de manera peresoza se realiza cuando este accede a la propiedad de la clase
    println(u2.firstName)
}

class User(var firstName: String, var lastName: String, var age: Int) {
    init {
        println("User: $firstName $lastName was created")
    }
}