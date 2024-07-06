package me.fabiansuarez.kotlin_fundamentals

fun main() {
    println("##############################################")
    println("################# KOTLIN #####################")
    println("##############################################")
    println()
    println("VARIABLES:")
    val nombre: String = "Fabian"
    val apellidos = "Suarez Carvajal"
    val edad: Int = 25
    val talla: Double = 1.85 //metros

    println("mi nombre es ${nombre + apellidos}. Tengo ${edad} y mido ${talla} mts.")

    println("ACTUALIZACION DE VARIABLES")

    //nombre = "Pepito" //Val cannot be reassigned

    var contador = 1
    println(contador)
    contador++
    println(contador)

    val trip1: Double = 3.20
    val trip2: Double = 4.10
    val trip3: Double = 1.72
    val totalTripLength: Double = trip1 + trip2 + trip3
    println("$totalTripLength Kms to destination")

    val notificationsEnabled: Boolean = false
    println("Are notifications enabled? " + notificationsEnabled)
}