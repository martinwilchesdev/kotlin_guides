fun main() {
    val s1 = Song("Supernaut", "Black Sabbath", 1972, 100000000)
    s1.description()
}

class Song(val title: String, val artist: String, val year: Int, playCounter: Int) {
    var isPopular = playCounter >= 1000

    fun description() {
        println("$title, performed by $artist, was released in $year")
    }
}