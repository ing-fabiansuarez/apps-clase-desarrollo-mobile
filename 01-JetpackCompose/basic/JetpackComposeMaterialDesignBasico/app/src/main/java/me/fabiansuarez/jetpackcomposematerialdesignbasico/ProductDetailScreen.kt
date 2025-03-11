package me.fabiansuarez.jetpackcomposematerialdesignbasico

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductDetailScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Detalle del Producto") },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack, // Ícono de Material Icons
                            contentDescription = "Favorite Icon", // Descripción para accesibilidad
                            tint = Color.Red // Color del ícono
                        )
                    }
                }
            )
        }
    ) { innerPadding  ->
        ContentScaffole(modifier = Modifier.padding(innerPadding))

    }
}

@Composable
fun ContentScaffole(modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {

                // Imagen del Producto
                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopEnd) {
                    Image(
                        painter = painterResource(id = R.drawable.img_computer),
                        contentDescription = "Imagen del Producto",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(250.dp)
                    )
                    IconButton(onClick = { /* TODO: Acción de favorito */ }) {
                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Agregar a favoritos",
                            tint = Color.Yellow
                        )
                    }

                }

                Spacer(modifier = Modifier.height(16.dp))

                // Información del Producto
                Text("Nombre del Producto", fontSize = 22.sp, fontWeight = FontWeight.Bold)
                Text(
                    "$99.99",
                    fontSize = 28.sp,
                    color = Color.Green,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(8.dp))
                HorizontalDivider()
                Spacer(modifier = Modifier.height(8.dp))

                // Descripción del Producto
                Text("Descripción del producto con detalles importantes, características y beneficios.")

                Spacer(modifier = Modifier.height(16.dp))
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Botones de Acción
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Button(
                onClick = { /* TODO: Agregar al carrito */ },
                modifier = Modifier.weight(1f)
            ) {
                Icon(
                    imageVector = Icons.Filled.Edit,
                    contentDescription = "Editar"
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Editar")
            }

            Button(
                onClick = { /* TODO: Comprar ahora */ },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
            ) {
                Icon(
                    imageVector = Icons.Filled.Delete,
                    contentDescription = "Eliminar",
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Eliminar", color = Color.White)
            }
        }
    }
}
