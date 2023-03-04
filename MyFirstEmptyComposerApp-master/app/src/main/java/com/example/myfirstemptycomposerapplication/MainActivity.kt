package com.example.myfirstemptycomposerapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myfirstemptycomposerapplication.ui.theme.MyFirstEmptyComposerApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstEmptyComposerApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    AppNameESubName("Meu primeiro app composer", "Primeiro Mesmo")
                }
            }
        }
    }
}
//PacalCase
@Composable
fun AppNameESubName(appName: String, appSubName: String) {
    Column {
        Text(text = "$appName!", fontSize = 26.sp, textAlign = TextAlign.Center)
        Text(text = "$appSubName!", fontSize = 16.sp)
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyFirstEmptyComposerApplicationTheme {
        AppNameESubName("Meu primeiro app composer", "Primeiro Mesmo!!!")
    }
}