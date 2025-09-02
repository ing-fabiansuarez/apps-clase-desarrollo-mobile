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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
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

@Composable
fun MiPantallaEjemplo() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.LightGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Un Row para distribuir elementos horizontalmente
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(Color.Cyan)
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Inicio", modifier = Modifier.background(Color.Magenta).padding(8.dp))
            Text(text = "Perfil", modifier = Modifier.background(Color.Yellow).padding(8.dp))
            Text(text = "Configuración", modifier = Modifier.background(Color.Green).padding(8.dp))
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Una Column para distribuir elementos verticalmente
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .padding(8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Título Principal", modifier = Modifier.background(Color.Magenta).padding(8.dp))
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "Descripción corta del contenido", modifier = Modifier.background(Color.Yellow).padding(8.dp))
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "Otro elemento de texto", modifier = Modifier.background(Color.Green).padding(8.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MiPantallaEjemploPreview() {
    MiPantallaEjemplo()
}

@Preview(showBackground = true)
@Composable
fun DemoScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween, // Distribuye el espacio vertical
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Encabezado",
            modifier = Modifier
                .background(Color(0xFF90CAF9))
                .padding(8.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFA5D6A7))
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly, // Distribuye horizontalmente
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Item 1",
                modifier = Modifier
                    .background(Color(0xFFFFF59D))
                    .padding(8.dp)
            )
            Text(
                text = "Item 2",
                modifier = Modifier
                    .background(Color(0xFFFFCC80))
                    .padding(8.dp)
            )
            Text(
                text = "Item 3",
                modifier = Modifier
                    .background(Color(0xFFCE93D8))
                    .padding(8.dp)
            )
        }

        Text(
            text = "Pie de página",
            modifier = Modifier
                .background(Color(0xFFEF9A9A))
                .padding(8.dp)
        )
    }
}





@Preview(showSystemUi = true)
@Composable
fun PantallaPerfil() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()), // Para hacer scroll si hay mucho contenido
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Imagen de perfil
        Image(
            painter = painterResource(id = R.drawable.mi_imagen_ciclismo),
            contentDescription = "Profile Image",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Nombre del usuario
        Text(
            text = "Juan Pérez",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Descripción del usuario
        Text(
            text = "Desarrollador Android apasionado por la tecnología y el diseño.",
            fontSize = 16.sp,
            modifier = Modifier.padding(horizontal = 32.dp),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Row con estadísticas
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            StatItem("150", "Posts")
            StatItem("2.3K", "Seguidores")
            StatItem("980", "Likes")
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Botones de acción
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(
                onClick = { /* Acción seguir */ },
                modifier = Modifier.weight(1f)
            ) {
                Text("Seguir")
            }

            Spacer(modifier = Modifier.width(16.dp))

            OutlinedButton(
                onClick = { /* Acción mensaje */ },
                modifier = Modifier.weight(1f)
            ) {
                Text("Mensaje")
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        // Sección de intereses
        Text(
            text = "Intereses",
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.align(Alignment.Start)
        )

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            InterestChip("Ciclismo")
            InterestChip("Programación")
            InterestChip("UI/UX")
        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            InterestChip("Música")
            InterestChip("Viajes")
            InterestChip("Gaming")
        }

        Spacer(modifier = Modifier.height(32.dp))

        // Tarjetas de proyectos o posts
        Text(
            text = "Proyectos Recientes",
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.align(Alignment.Start)
        )

        Spacer(modifier = Modifier.height(12.dp))

        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            ProjectCard(
                title = "App de Ciclismo",
                description = "Aplicación para rastrear rutas de ciclismo con mapas y estadísticas.",
                imageRes = R.drawable.mi_imagen_ciclismo
            )
            ProjectCard(
                title = "UI Kit Moderno",
                description = "Colección de componentes Jetpack Compose con estilo moderno.",
                imageRes = R.drawable.mi_imagen_ciclismo
            )
            ProjectCard(
                title = "Blog de Tecnología",
                description = "Artículos sobre desarrollo Android, arquitectura y diseño.",
                imageRes = R.drawable.mi_imagen_ciclismo
            )
        }
    }
}

// Composable reutilizable para stats
@Composable
fun StatItem(value: String, label: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = value, fontWeight = FontWeight.Bold, fontSize = 18.sp)
        Text(text = label, fontSize = 14.sp, color = Color.Gray)
    }
}

// Composable para chips de intereses
@Composable
fun InterestChip(text: String) {
    Box(
        modifier = Modifier
            .background(Color.LightGray, shape = RoundedCornerShape(16.dp))
            .padding(horizontal = 12.dp, vertical = 6.dp)
    ) {
        Text(text = text, fontSize = 14.sp)
    }
}

// Composable para tarjetas de proyectos
@Composable
fun ProjectCard(title: String, description: String, imageRes: Int) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(140.dp),
        elevation = CardDefaults.cardElevation(6.dp),
        shape = RoundedCornerShape(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxHeight()
                    .width(120.dp),
                contentScale = ContentScale.Crop
            )

            Column(
                modifier = Modifier
                    .padding(12.dp)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = title, fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text(text = description, fontSize = 14.sp, color = Color.Gray, maxLines = 3)
                Button(onClick = { /* Detalle proyecto */ }, modifier = Modifier.align(Alignment.End)) {
                    Text("Ver más")
                }
            }
        }
    }
}