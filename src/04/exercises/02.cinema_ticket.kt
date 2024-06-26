fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    when {
        age <= 12 -> {
            return 15
        }
        age in 12..60 -> {
            if (isMonday) {
                return 25
            }
            return 30
        }
        age >= 61 -> {
            return 20
        }
        else -> {
            return -1
        }
    }
}