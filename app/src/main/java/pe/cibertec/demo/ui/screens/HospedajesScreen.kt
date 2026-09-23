package pe.cibertec.demo.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.cibertec.demo.R
import pe.cibertec.demo.ui.theme.CibertecdemoTheme

data class Hospedaje(
    val estado: String,
    val nombre: String,
    val ubicacion: String,
    val descripcion: String,
    val imagen: Int
)

@Composable
fun HospedajesScreen(modifier: Modifier = Modifier) {
    val hospedajes = listOf(
        Hospedaje(
            "Disponible",
            "McWay Falls",
            "California, USA",
            "Cascada ubicada en la costa de Big Sur.",
            R.drawable.hotel_lima
        ),
        Hospedaje(
            "No disponible",
            "Muralla China",
            "China",
            "Antigua fortificación de China.",
            R.drawable.hotel_lima_2
        ),
        Hospedaje(
            "Disponible",
            "Torre Eiffel",
            "París, Francia",
            "Monumento emblemático de París.",
            R.drawable.hotel_lima_3
        ),
        Hospedaje(
            "Disponible",
            "Machu Picchu",
            "Cusco, Perú",
            "Ciudadela inca ubicada en los Andes.",
            R.drawable.hotel_lima_4
        )
    )

    Column(
        modifier = modifier.fillMaxSize()
    ) {
        Text(
            text = "Travel App",
            modifier = Modifier.padding(16.dp)
        )

        LazyColumn {
            items(hospedajes) { hospedaje ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Column(
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(text = hospedaje.estado)
                        Text(text = hospedaje.nombre)
                        Text(text = hospedaje.ubicacion)
                        Text(text = hospedaje.descripcion)
                    }

                    Image(
                        painter = painterResource(hospedaje.imagen),
                        contentDescription = hospedaje.nombre,
                        modifier = Modifier.size(100.dp),
                        contentScale = ContentScale.Crop
                    )
                }

                HorizontalDivider()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HospedajesScreenPreview() {
    CibertecdemoTheme {
        HospedajesScreen()
    }
}