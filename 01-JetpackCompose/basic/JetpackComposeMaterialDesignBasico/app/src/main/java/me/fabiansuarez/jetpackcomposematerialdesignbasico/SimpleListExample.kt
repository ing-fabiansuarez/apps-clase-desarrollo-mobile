package me.fabiansuarez.jetpackcomposematerialdesignbasico

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun SimpleListExample() {
    val items = listOf("Elemento 1", "Elemento 2", "Elemento 3", "Elemento 4", "Elemento 5")
    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(items) { item ->
            Text(
                text = item,
                modifier = Modifier.padding(8.dp)
            )
            HorizontalDivider()
        }
    }
}