package me.fabiansuarez.kotlin_fundamentals

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text



//EMEMPLO BASICO PARA EXPLICAR JUSNTO A LAMBDAS FOR BEGINNERS

/*
* la idea de este ejercciios es que usen Column y Text para crear una interfaz sencilla, pero que no vean nada de etiquetas
* @Composable, ni que se les hable de jetpack compose, hasta el momento solo queremos que con este ejercicios los estudiantes se centre
* en el concepto de lambda y de como funciona internamente una lambda.*/
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            // Un Column es un layout que organiza elementos en columna
            Column() {

                Text(text = "📚 Lambdas en Kotlin")

                Text(
                    text = """
                        Una lambda es como una función "rápida" que podemos escribir directamente 
                        donde la necesitamos, sin declararla con 'fun'.
                        Ademas la podemos guardar en una variable
                    """
                )

                Text(
                    text = "Ejemplo básico de lambda:"
                )

                // Ejemplo 2: usando una lambda como evento en un botón
                Button(onClick = {
                    println("¡Botón presionado!")
                }) {
                    Text("Presióname")
                }
                Text(
                    text = """
                        💡 En Jetpack Compose, los parámetros como 'onClick' aceptan lambdas.
                        Así podemos definir el comportamiento directamente.
                    """
                )
            }
        }
    }
}

