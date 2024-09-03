package me.fabiansuarez.kotlin_fundamentals

import androidx.compose.ui.util.packInts

fun main() {

    // BASICO DE LAS LAMBDAS
    //========================================================0

    val myLambdaSaludo : () -> Unit = ::saludo
    myLambdaSaludo()
    myLambdaSaludo()

    val saludoComoVariable = {
        println("Hola , estamos aprendiendo lambdas")
        println("Fabian Suarez")
        println("Codeline 1")
        println("Codeline 2")
        println("Codeline 3")
        println("Codeline 4")
        println()
    }
    saludoComoVariable()

    val nombre: String = "Fabian Suarez"
    //val myLambadaSaludoPerzonalizado : (String) -> Unit = ::saludoPersonalizado
    //myLambadaSaludoPerzonalizado(nombre)

    val myLambadaSaludoPerzonalizado : (String)->Unit = { it ->
        println("Hola $it")
    }

    myLambadaSaludoPerzonalizado(nombre)

    val myLambdaSuma : (Int, Int) -> Int = {number1,number2->
        number1 + number2
    }

    val myLambdaSumaOtraForma : (Int, Int) -> Int = fun (number1: Int, number2: Int): Int {
        return number1 + number2
    }

    println( myLambdaSuma(5,3) )


    //========================================================1
    //FUNCIONES DE ORDEN SUPERIOR

    val suma = operarNumeros(10, 5) { x, y -> x + y }
    val resta = operarNumeros(10, 5) { x, y -> x - y }
    val multiplicacion = operarNumeros(10, 5) { x, y -> x * y }
    val division = operarNumeros(10, 5) { x, y -> x / y }

    println("Suma: $suma")           // Output: Suma: 15
    println("Resta: $resta")         // Output: Resta: 5
    println("Multiplicación: $multiplicacion") // Output: Multiplicación: 50
    println("División: $division")   // Output: División: 2



}

fun saludo(): Unit {
    println("Hola , estamos aprendiendo lambdas")
    println("Fabian Suarez")
    println("Codeline 1")
    println("Codeline 2")
    println("Codeline 3")
    println("Codeline 4")
    println()
}

fun saludoPersonalizado(nombre: String) {
    println("Hola $nombre")
}

fun suma(number1: Int, number2: Int) : Int{
    return number1 + number2
}

fun operarNumeros(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
    return operacion(a, b)
}

