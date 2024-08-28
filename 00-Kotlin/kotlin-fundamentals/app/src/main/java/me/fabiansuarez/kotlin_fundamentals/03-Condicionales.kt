package me.fabiansuarez.kotlin_fundamentals

fun main() {
    login(email = "prueba@unab.edu.co", password = "123456")
}

fun login(email: String, password: String) : Boolean{
    val emailData = "admin@unab.edu.co"
    val passwordData = "admin"

    if (email == emailData && password == passwordData){
        println("Inicio de Sesion")
        return true
    }else{
        println("Error de inicio de sesion")
        return false
    }
}

fun multiple() {
    val trafficLightColor = "Green"

    if (trafficLightColor == "Red") {
        println("Stop")
    } else if (trafficLightColor == "Yellow") {

    } else {
        println(message = "Go")
    }
}

fun useWhen() {
    val trafficLightColor = "Black"

    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow" -> println("Slow")
        "Green" -> println("Go")
        else -> {
            println("Invalid traffic-light color")
        }
    }
}

fun useWhenMultiple() {
    val x = 3
    when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        3 -> println("x is a prime number between 1 and 10.")
        5 -> println("x is a prime number between 1 and 10.")
        7 -> println("x is a prime number between 1 and 10.")
        else -> {
            println("x isn't a prime number between 1 and 10.")
        }
    }
}

fun rangosWhen() {
    val x = 3

    when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        else -> {
            println("x isn't a prime number between 1 and 10.")
        }
    }
}

fun verificaTipoDeDato() {
    val x: Any = 4

    when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        is Int -> println("x is an integer number, but not between 1 and 10.")
        else -> {
            println("x isn't a prime number between 1 and 10.")
        }
    }

}

fun usarloComoExpresiones() {
    val trafficLightColor = "Black"

    val message =
        if (trafficLightColor == "Red") "Stop"
        else if (trafficLightColor == "Yellow") "Slow"
        else if (trafficLightColor == "Green") "Go"
        else "Invalid traffic-light color"
}



