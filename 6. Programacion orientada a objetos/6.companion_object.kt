fun main() {
    // El metodo sum() de la clase es invocado por la clase misma
    val result = Calculator.sum(1,2)
    println(result)

    // La propiedad max es accedida por la clase misma
    println(Calculator.max)
}

class Calculator() {
    // El companion objeto permite acceder a las propiedades y metodos de una clase sin necesidad de instanciar un objeto
    companion object {
        /**
         * Las funciones y propiedades que se definen dentro del companion object se denominan funciones y propiedades
         * de clase ya que no pertenecen a un objeto especifico sino a la clase misma
         * */
        var max = 100
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }
}