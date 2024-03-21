fun main() {
    /**
     * Las inner clases son clases que se declaran dentro de otras clases, generalmente usadas cuando se
     * sabe que hay una relacion muy estrecha entre 2 clases
     * */

    val l1 = ListView(arrayOf("Name 1", "Name 2"))
    l1.ListViewItem().displayItems(1)
}

class ListView(val items: Array<String>) {

    // Las clases internas tienen acceso a las propiedades de la clase externa
    inner class ListViewItem() {
        fun displayItems(position: Int) {
            println(items[position])
        }
    }
}