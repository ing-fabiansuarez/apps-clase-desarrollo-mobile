package me.fabiansuarez.kotlin_fundamentals

import androidx.compose.runtime.Composable


fun main() {
    // ==============================================
    // Simulación de un Composable con Prints
    //================================================

    Column {
        Text("Hola, Jetpack Compose!")
        Button(onClick = { println("Botón ha sido presionado") }) {
            Text("Presioname")
        }
    }
}

fun Text(text: String) {
    println("Text: $text")
}

fun Button(onClick: () -> Unit, content: () -> Unit) {
    println("Button:")
    content()
    println("Button clicked")
    onClick()
}

fun Column(content: () -> Unit) {
    println("Column start")
    content()
    println("Column end")
}