package lesson_1

fun main() {
    val numberOfOrders: Int = 75;
    val thankMessage: String = "Thank you for your order!"
    println("$numberOfOrders orders have been received. $thankMessage");

    var numberOfEmployee = 2000;
    //println("$numberOfEmployee employees are currently working here.")

    fun dismissEmployee(): Unit {
        numberOfEmployee--;
    }

    dismissEmployee()
    println("$numberOfEmployee employees are currently working here.")
}