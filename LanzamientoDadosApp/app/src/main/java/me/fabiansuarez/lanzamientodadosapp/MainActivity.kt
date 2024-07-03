package me.fabiansuarez.lanzamientodadosapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import me.fabiansuarez.lanzamientodadosapp.ui.theme.LanzamientoDadosAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApp()
        }
    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun MyApp() {
    DiceWithButtonAndImage()
}

@Composable
private fun DiceWithButtonAndImage(modifier: Modifier = Modifier.fillMaxSize()) {

    var result = 1
    val painter = painterResource(id = R.drawable.dice_1)
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painter, contentDescription = null)
        Button(onClick = {
            result = (1..6).random()
        }) {
            Text(text = stringResource(R.string.roll_dice))
        }
    }
}