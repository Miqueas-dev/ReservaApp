package pe.cibertec.demo

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pe.cibertec.demo.ui.screens.LoginScreen
import pe.cibertec.demo.ui.theme.CibertecdemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            CibertecdemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LoginScreen(
                        modifier = Modifier.padding(innerPadding),
                        onIngresar = {
                            val intent = Intent(
                                this@MainActivity,
                                HospedajesActivity::class.java
                            )
                            startActivity(intent)
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(
    name: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = "Cibertec $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CibertecdemoTheme {
        LoginScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingFullScreenPreview() {
    CibertecdemoTheme {
        LoginScreen(
            modifier = Modifier.fillMaxSize()
        )
    }
}