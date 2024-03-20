fun main() {
    /**
     * Las clases enum se utilizan cuando se quiere representar un conjunto fijo de valores.
     * Las clases enum se utilizan principalmente junto a estructuras condicionales.
     * */
    val direction = Direction.EAST

    when(direction) {
        Direction.EAST -> {
            println("The direction is East")
        }
        Direction.WEST -> {
            println("The direction is West")
        }
        Direction.NORTH -> {
            println("The direction is North")
        }
        Direction.SOUTH -> {
            println("The direction is South")
        }
    }

    /**
     * Los valores enum pueden acceder a los metodos de clase, los cuales a su vez pueden acceder
     * a los parametros especificados en el constructor de la variable enum
     * */
    Direction.WEST.printData()
}

enum class Direction(var direction: String, var distance: Int) {
    /**
     * El nombre de los valores enum deben estar en mayuscula.
     * Los valores enum son instancias dentro de la clase a la que pertenecen
     * */
    NORTH("north", 12),
    SOUTH("south", 13),
    EAST("east", 20),
    WEST("west", 30); // Se debe añadir `;` luego de la definicion del ultimo valor enum

    fun printData() {
        println("Direction $direction and Distance $distance")
    }
}