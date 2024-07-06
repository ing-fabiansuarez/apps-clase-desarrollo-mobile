package me.fabiansuarez.kotlin_fundamentals

fun main() {

    println("##############################################")
    println("################# FUNTIONS #####################")
    println("##############################################")
    birthdayGreeting()


    val greeting = birthdayGreetingWithReturn()
    println(greeting)
    println(birthdayGreetingWithReturnAndParameters(name = "Rover"))

}

fun birthdayGreeting() {
    println("Happy Birthday, Rover!")
    println("You are now 5 years old!")
}

fun birthdayGreetingWithReturn(): String {
    val nameGreeting = "Happy Birthday, Rover!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun birthdayGreetingWithReturnAndParameters(name: String): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}

