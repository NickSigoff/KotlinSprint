package org.example.lesson_2

fun main() {
    val employeeSalary = 30000
    val traineeSalary = 20000
    val numberOfEmployees = 50
    val numberOfTrainees = 30

    val employeesExpenses = numberOfEmployees * employeeSalary
    println("Employees expenses: $employeesExpenses")

    val traineesExpenses = numberOfTrainees * traineeSalary

    val totalExpenses = employeesExpenses + traineesExpenses
    println("Total expenses: $totalExpenses")

    val averageSalary = (totalExpenses / (numberOfEmployees + numberOfTrainees))
    println("Average salary: $averageSalary")
}