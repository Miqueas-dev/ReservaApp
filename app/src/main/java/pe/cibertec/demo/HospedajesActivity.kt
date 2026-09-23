package pe.cibertec.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import pe.cibertec.demo.ui.screens.HospedajesScreen
import pe.cibertec.demo.ui.theme.CibertecdemoTheme

class HospedajesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CibertecdemoTheme {
                HospedajesScreen()
            }
        }
    }
}