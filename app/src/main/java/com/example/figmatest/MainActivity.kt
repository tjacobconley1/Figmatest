package com.example.figmatest

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.figmatest.loginbutton.LoginButton
import com.example.figmatest.loginbutton.Prop
import com.example.figmatest.ui.theme.FigmatestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FigmatestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ){
                        Spacer(modifier = Modifier.height(16.dp))
                        LoginButton(
                            loginText = "Login",
                            modifier = Modifier.fillMaxWidth(),
                            prop = Prop.Primary,
                            onPropOnClick = {
                                Toast.makeText(
                                    applicationContext,
                                    "Login Button Clicked",
                                    Toast.LENGTH_LONG
                                ).show()
                            },
                            //loginIcon ={ Icon(imageVector = Icons.Default.ArrowForward, contentDescription = null) },
                        )

                        //Spacer(modifier = Modifier.height(16.dp))
//                        LoginButton(
//                            loginText = "Login",
//                            modifier = Modifier.fillMaxWidth(),
//                            prop = Prop.Secondary,
//                            onPropOnClick = {
//                                Toast.makeText(
//                                    applicationContext,
//                                    "Login Button Clicked",
//                                    Toast.LENGTH_LONG
//                                ).show()
//                            },
//                            //loginIcon = Icon(imageVector = Icons.Default.ArrowForward, contentDescription = null)
//                        ) {
//
//                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FigmatestTheme {
        Greeting("Android")
    }
}