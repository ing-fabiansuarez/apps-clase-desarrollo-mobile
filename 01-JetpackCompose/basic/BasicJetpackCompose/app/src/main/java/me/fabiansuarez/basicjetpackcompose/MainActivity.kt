package me.fabiansuarez.basicjetpackcompose

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.fabiansuarez.basicjetpackcompose.ui.theme.BasicJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            PantallaPrincipal()
        }
    }
}

@Preview(
    name = "My preview",
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PantallaPrincipal() {
    PresentacionPersonal(nombre = "Fabián Suárez", profesion = "Ingeniero de sistemas")
}

@Composable
fun PresentacionPersonal(nombre: String, profesion: String) {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Top) {
        Text(
            text = stringResource(R.string.mi_nombre_es, nombre),
            fontSize = 54.sp,
            lineHeight = 54.sp,
            // Solid element background color
            modifier = Modifier
                .padding(
                    start = 26.dp,
                    top = 16.dp,
                    end = 26.dp,
                    bottom = 16.dp
                )
                .background(color = Color.Green),
            textAlign = TextAlign.Center
        )
        Text(
            text = "Soy $profesion",
            fontSize = 44.sp,
            lineHeight = 44.sp,
        )
        Text(
            text = stringResource(R.string.lenguajes),
            fontSize = 30.sp,
            modifier = Modifier
                .align(alignment = Alignment.End)
                .padding(16.dp)
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            content = {
                Text(text = "Java", fontSize = 30.sp)
                Text(text = "Kotlin", fontSize = 30.sp)
                Text(text = "C#", fontSize = 30.sp)
                Text(text = "Php", fontSize = 30.sp)
            })
        HobbyPicture()
    }
}

@Composable
fun HobbyPicture() {
    val image = painterResource(id = R.drawable.mi_imagen_ciclismo)
    Box (modifier = Modifier.fillMaxSize()) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Text(text = "Ciclismo", fontSize = 20.sp)
    }
}



