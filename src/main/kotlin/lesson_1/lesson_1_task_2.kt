package lesson_1


var numberOfEmployees = 2000
fun main() {
    val numberOfOrders: Int = 75
    val thankMessage: String = "Thank you for your order!"
    println("$numberOfOrders orders have been received. $thankMessage")

    //println("$numberOfEmployee employees are currently working here.")
    dismissEmployee()
    println("$numberOfEmployees employees are currently working here.")
}

fun dismissEmployee(): Unit {
    numberOfEmployees--
}