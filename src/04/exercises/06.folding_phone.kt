fun main() {
    var p1 = FoldablePhone(false)
    p1.switchOn()
}

open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(isFoldable: Boolean): Phone() {
    var isFoldable = isFoldable

    override fun switchOn() {
        if (!this.isFoldable) {
            isScreenLightOn = true
            println("The phone is fold and the screen is off")
        } else {
            println("The phone is unfold and the screen is on")
        }
    }

    fun foldPhone() {
        this.isFoldable = false
    }

    fun unFoldPhone() {
        this.isFoldable = true
    }
}