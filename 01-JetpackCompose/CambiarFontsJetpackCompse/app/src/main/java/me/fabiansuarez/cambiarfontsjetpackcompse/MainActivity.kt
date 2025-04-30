package me.fabiansuarez.cambiarfontsjetpackcompse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import me.fabiansuarez.cambiarfontsjetpackcompse.ui.theme.CambiarFontsJetpackCompseTheme
import me.fabiansuarez.cambiarfontsjetpackcompse.ui.theme.manropeFamily

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CambiarFontsJetpackCompseTheme {
                Bienvenidos()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Bienvenidos() {
    Column {
        Text("Fuentes Perzonalizadas", fontSize = 24.sp)
        Text("Jetpack Compose", fontSize = 22.sp)
        Text("Android Studio", fontSize = 20.sp)
        Text("XD XD XD XD XD", fontSize = 16.sp)
    }
}
