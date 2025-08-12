package me.fabiansuarez.kotlin_fundamentals

import kotlin.random.Random

fun ageValidate(age: Int): String {
    var message = ""
    if (age < 18) {
        message += ", soy menor de edad"
    } else if (age < 50) {
        message += ", soy adulto"
    } else {
        message += ", soy mayor"
    }
    return message
}

/*
// Ejemplo de función con parámetro opcional (Kotlin usa valores por defecto)
fun printUser(name: String, age: Int = 5) {
    println("Soy $name ${ageValidate(age)}")
}
*/

// Función con callback
fun printUser(name: String, age: Int, callBack: () -> String) {
    println("Soy $name ${ageValidate(age)}, ${callBack()}")
}

fun main() {
    println("********** VARIABLES Y TIPOS DE DATOS ***************")

    val age = Random.nextInt(10, 55) // entre 10 y 54
    val name = "Fabian"
    val height = 1.75
    val isLogin = Random.nextBoolean()

    println("Soy $name, tengo $age años, mido $height metros")

    var message = "Soy $name"

    // ESTRUCTURAS DE DATOS
    if (age < 18) {
        message += ", soy menor de edad"
    } else if (age < 50) {
        message += ", soy adulto"
    } else {
        message += ", soy mayor"
    }

    message += ", soy una persona"

    when {
        height < 1.5 -> message += " bajita"
        height < 2.0 -> message += " alta"
        else -> message += " gigante"
    }

    message += " ${if (isLogin) "ya" else "no"} he iniciado sesión"

    println(message)

    println("")
    println("****** FUNCIONES *************")
    printUser("Pedro", 25) {
        var msg = ", soy una persona"
        when {
            height < 1.5 -> msg += " bajita"
            height < 2.0 -> msg += " alta"
            else -> msg += " gigante"
        }
        msg
    }

    println("")
    println("*********** LIST Y MAPS ***********")
    val productNames = listOf(3, "fabian", true)
    val productPrice = mutableListOf(2000, 300)

    println(productNames)

    val pc = mutableMapOf("name" to "PC", "price" to 2500)
    val teclado = mutableMapOf("name" to "Teclado", "price" to 3500)

    println("El ${teclado["name"]} vale ${teclado["price"]}")

    val products = listOf(pc, teclado)

    println("El ${products[0]["name"]} vale ${products[0]["price"]}")
    println("El ${products[1]["name"]} vale ${products[1]["price"]}")

    println("")
    println("*********** BUCLES ***********")
    for (product in products) {
        println("El ${product["name"]} vale ${product["price"]}")
    }
    for (i in products.indices) {
        println("El ${products[i]["name"]} vale ${products[i]["price"]}")
    }

    println("")
    println("**************** POO ******************")

    val fabian = User("Fabian")
    println(fabian.name)

    val dog: Animal = Dog("Chester")
    val dolphin: Animal = Dolphin("Flyper")
    val duck: Animal = Duck("Dokky")

    (dog as Dog).walk()

    val animals = listOf(dog, dolphin)

    for (animal in animals) {
        when (animal) {
            is Dog -> animal.walk()
            is Dolphin -> animal.swim()
            is Duck -> {
                animal.walk()
                animal.swim()
            }
        }
    }
}

class User(val name: String) {
    val age: Int = Random.nextInt(10, 55)
}

abstract class Animal(val name: String) {
    abstract fun emmitSound()
}

interface Walk {
    fun walk() {
        println("Walking....")
    }
}

interface Swim {
    fun swim() {
        println("Nadandooo....")
    }
}

class Dog(name: String) : Animal(name), Walk {
    override fun emmitSound() {
        println("Guau guau")
    }
}

class Duck(name: String) : Animal(name), Walk, Swim {
    override fun emmitSound() {
        println("Cuack cuack")
    }

    override fun walk() {
        println("Walking....")
    }
}

class Dolphin(name: String) : Animal(name), Swim {
    override fun emmitSound() {
        println("iiiii iiii")
    }
}
