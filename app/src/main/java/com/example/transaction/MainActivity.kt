package com.example.transaction

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
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
import com.example.transaction.ui.theme.TransactionTheme
import com.example.transaction.ui.theme.backgroundcolor
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
fun TransactionScreen(modifier: Modifier = Modifier) {
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

@Preview(showBackground = true)
@Composable
fun TransactionScreenPreview() {
    TransactionTheme {
        TransactionScreen()
    }
}