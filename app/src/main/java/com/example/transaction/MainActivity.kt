package com.example.transaction

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.transaction.ui.theme.TransactionTheme
import com.example.transaction.ui.theme.backgroundcolor
import com.example.transaction.ui.theme.labelColor
import com.example.transaction.ui.theme.textValue
import com.example.transaction.ui.theme.topBarColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TransactionTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ){
                        TransactionScreen()

                }
            }
        }
    }
}

@Composable
fun TransactionScreen(
    modifier: Modifier = Modifier,
    
) {
    Box(modifier = Modifier.fillMaxSize()){
        AppBar()
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(){
    CenterAlignedTopAppBar(
        navigationIcon = {
            IconButton(
                onClick = { /*TODO*/ }
            ) {
                Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "Go back")
            }
        },
        title = {
                    Text(
                        text = stringResource(id = R.string.screenName),
                        style = MaterialTheme.typography.bodyMedium,
                        color = topBarColor,
                        textAlign = TextAlign.Center,
                    )
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = backgroundcolor),
    )
}

@Composable
fun ScreenItem(label: String, value: String, modifier: Modifier = Modifier){
    val labelColor = labelColor
    val textColor = textValue

    Column(modifier = Modifier) {
        Text(
            text = label,
            style = MaterialTheme.typography.titleSmall,
            color = labelColor,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Text(
            text = value,
            style = MaterialTheme.typography.bodySmall,
            color = textColor
        )
        Spacer(modifier = Modifier.height(16.dp))

    }
}

@Composable
fun MeterDetails(
    @StringRes meterNo: Int,
    @StringRes meterName: Int,
    @StringRes phoneNo: Int,
    numLabel: Int,
    nameLabel: Int,
    phoneLabel: Int,
    modifier: Modifier = Modifier
){

    Column(modifier = Modifier) {
        ScreenItem(label = stringResource(numLabel), value = stringResource(meterNo))
        ScreenItem(label = stringResource(nameLabel), value = stringResource(meterName))
        ScreenItem(label = stringResource(phoneLabel), value = stringResource(phoneNo))
    }

}

@Composable
fun ServiceDetails(
    @StringRes serviceProv: Int,
    @StringRes product: Int,
    @StringRes address: Int,
    @StringRes timestamp: Int,
    serviceProvLabel: Int,
    productLabel: Int,
    addressLabel: Int,
    timeLabel: Int,
){
    Column(modifier = Modifier) {
        ScreenItem(label = stringResource(serviceProvLabel), value = stringResource(serviceProv))
        ScreenItem(label = stringResource(productLabel), value = stringResource(product))
        ScreenItem(label = stringResource(addressLabel), value = stringResource(address))
        ScreenItem(label = stringResource(timeLabel), value = stringResource(timestamp))
    }

}

@Composable
fun PaymentDetails(
    @StringRes amount: Int,
    @StringRes numOfUnit: Int,
    @StringRes servCharge: Int,
    amountLabel: Int,
    numOfUnitLabel: Int,
    servChargeLabel: Int
){
    Column(modifier = Modifier) {
        ScreenItem(label = stringResource(amountLabel), value = stringResource(amount))
        ScreenItem(label = stringResource(numOfUnitLabel), value = stringResource(numOfUnit))
        ScreenItem(label = stringResource(servChargeLabel), value = stringResource(servCharge))
    }

}


@Preview(showBackground = true)
@Composable
fun TransactionScreenPreview() {
    TransactionTheme {
        TransactionScreen()
    }
}