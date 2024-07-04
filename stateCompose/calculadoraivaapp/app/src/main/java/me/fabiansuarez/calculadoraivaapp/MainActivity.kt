package me.fabiansuarez.calculadoraivaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusTargetModifierNode
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import me.fabiansuarez.calculadoraivaapp.ui.theme.CalculadoraIVAAppTheme
import java.text.NumberFormat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApp()
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun MyApp() {
    CalculadoraIVAAppTheme {
        FormTaxesLayout()
    }
}

@Composable
fun FormTaxesLayout() {
    //var amountInput = "0"
    var amountInput by remember {
        mutableStateOf("")
    }

    val amount = amountInput.toDoubleOrNull() ?: 0.0

    val tax = calculateTax(amount)

    Column(
        modifier = Modifier
            .padding(40.dp)
            .verticalScroll(rememberScrollState())
            .safeDrawingPadding()
            .statusBarsPadding()

    ) {
        Text(
            text = "Calculadora de Impuestos",
            modifier = Modifier
                .padding(bottom = 16.dp, top = 40.dp)
                .align(alignment = Alignment.Start)
        )
        EditNumberField(
            value = amountInput,
            onValueChange = {
                amountInput = it
            },
            modifier = Modifier
                .padding(bottom = 32.dp)
                .fillMaxWidth()
        )
        Text(
            text = stringResource(R.string.calculo_de_impuesto,tax),
            style = MaterialTheme.typography.headlineSmall
        )
        Spacer(modifier = Modifier.height(150.dp))
    }
}

@Composable
fun EditNumberField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
) {


    /*TextField(
        value = amountInput.value,
        .....
    )*/
    TextField(
        value = value,
        onValueChange = onValueChange,
        label = {
            Text(text = "Cantidad a calcular")
        },
        singleLine = true,//Esto condensa el cuadro de texto en una sola línea desplazable horizontalmente a partir de varias líneas.
        modifier = modifier,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
}


private fun calculateTax(amount: Double, taxPercent: Double = 19.0): String {
    val tax = taxPercent / 100 * amount
    return NumberFormat.getCurrencyInstance().format(tax)
}

