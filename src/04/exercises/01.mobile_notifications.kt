fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(notificationsAmount: Int) {
    if (notificationsAmount >= 100) {
        println("Your phone is blowing up! You have +99 notifications")
    } else {
        println("You have $notificationsAmount notifications.")
    }
}