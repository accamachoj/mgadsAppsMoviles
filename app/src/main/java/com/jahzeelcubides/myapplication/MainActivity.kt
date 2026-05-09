package com.jahzeelcubides.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            MyApp();


        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyApp() {

    Column (modifier = Modifier
        .background(Color.Yellow)
        .padding(15.dp)
        .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Row (
            modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()){

            Text(
                text = "Inicio",
                modifier = Modifier
                    .padding(15.dp)
                    .background(Color.Green)
                    .padding(15.dp)
                    .weight(1f)
            )
            Text(
                text = "perfil",
                modifier = Modifier
                    .padding(15.dp)
                    .background(Color.Green)
                    .padding(15.dp)
                    .weight(1f)
            )
            Text(
                text = "Configuracion",
                modifier = Modifier
                    .padding(15.dp)
                    .background(Color.Green)
                    .padding(15.dp)
                    .weight(1f)
            )

        }

        Spacer(modifier = Modifier.height(16.dp))

        Image(painter = painterResource(R.drawable.tecna),
            contentDescription = "mi imagen",
            modifier = Modifier.width(400.dp)
                .height(300.dp)
                .clip(CircleShape),
            contentScale = ContentScale.FillBounds
        )


        Text(
            text = "Inicio",
            modifier = Modifier
                .padding(15.dp)
                .background(Color.Green)
                .padding(15.dp)
                .weight(1f)
        )
        Text(
            text = "perfil",
            modifier = Modifier
                .padding(15.dp)
                .background(Color.Green)
                .padding(15.dp)
                .weight(1f)
        )
        Text(
            text = "Configuracion",
            modifier = Modifier
                .padding(15.dp)
                .background(Color.Green)
                .padding(15.dp)
                .weight(1f)
        )
    }



}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun segundaPantalla() {

    Column (modifier = Modifier
        .background(Color.White)
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(painter = painterResource(R.drawable.check),
            contentDescription = "mi imagen",
            modifier = Modifier.width(200.dp)
                .height(200.dp)
                .clip(CircleShape),
            contentScale = ContentScale.FillBounds
        )
        Text(
            text = "all tasks completed",
            modifier = Modifier
                .padding(5.dp)
                .background(Color.White)
                .padding(5.dp)

        )
        Text(
            text = "Nice Work!",
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(5.dp)
                .background(Color.White)
                .padding(5.dp)
        )

    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun tercerapantalla() {

    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
            .background(Color(214, 176, 255))
    ) {
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {

            CeldaTabla(
                titulo = "Inicio",
                descripcion = "Lorem ipsum dolor sit amet consectetur adipiscing elit, " +
                        "fusce arcu venenatis eros aenean tortor, congue porttitor " +
                        "facilisi posuere aptent curae.",
                colorFondo = Color(237, 224, 255),
                modifier = Modifier.weight(1f)
            )

            CeldaTabla(
                titulo = "Perfil",
                descripcion = "Lorem ipsum dolor sit amet consectetur adipiscing elit, " +
                        "fusce arcu venenatis eros aenean tortor, congue porttitor " +
                        "facilisi posuere aptent curae.",
                colorFondo = Color(171, 102, 255),
                modifier = Modifier.weight(1f)
            )
        }

        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {

            CeldaTabla(
                titulo = "Configuración",
                descripcion = "Lorem ipsum dolor sit amet consectetur adipiscing elit, " +
                        "fusce arcu venenatis eros aenean tortor, congue porttitor " +
                        "facilisi posuere aptent curae.",
                colorFondo = Color(200, 160, 255),
                modifier = Modifier.weight(1f)
            )

            CeldaTabla(
                titulo = "Ayuda",
                descripcion = "Lorem ipsum dolor sit amet consectetur adipiscing elit, " +
                        "fusce arcu venenatis eros aenean tortor, congue porttitor " +
                        "facilisi posuere aptent curae.",
                colorFondo = Color(255, 220, 250),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun CeldaTabla(
    titulo: String,
    descripcion: String,
    colorFondo: Color,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .fillMaxHeight()
            .background(colorFondo)
            .padding(15.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = titulo,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = descripcion,
            fontSize = 16.sp,
            color = Color.DarkGray
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
fun MiPantallaDos() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Top App Bar") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                ),
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = null
                    )
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null)
            }
        },
        bottomBar = {
            BottomBar()
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(paddingValues = innerPadding)
        ) {
            BodyScreen()
        }
    }
}

@Composable
fun BodyScreen() {
    Column (modifier = Modifier.padding(16.dp)){
        TextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Label") },
            trailingIcon = {
                Icon(Icons.Default.Search, contentDescription = null)
            },
            leadingIcon = {
                Icon(Icons.Default.Close, contentDescription = null)
            }
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Label") },
            trailingIcon = {
                Icon(Icons.Default.Search, contentDescription = null)
            },
            leadingIcon = {
                Icon(Icons.Default.Close, contentDescription = null)
            }
        )
        Button(onClick = {}) {
            Icon(Icons.Default.Add, contentDescription = "adicional")
            Text("save")
        }
        FilledTonalButton(onClick = {}) {
            Icon(Icons.Default.Add, contentDescription = "adicional")
            Text("save")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {

            Checkbox(
                checked = true,
                onCheckedChange = {}
            )

            Text(text = "Check")
        }

        Row(verticalAlignment = Alignment.CenterVertically) {

            Switch(
                checked = true,
                onCheckedChange = {}
            )

            Text(text = "Check")
        }

        Card (){
            Column (Modifier.padding(16.dp)){
                Text(text = "Card")
            }
        }

    }

}

@Composable
fun BottomBar() {
    NavigationBar {

        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = null
                )
            },
            label = { Text(text = "Home") }
        )

        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = null
                )
            },
            label = { Text(text = "Favoritos") }
        )

        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = null
                )
            },
            label = { Text(text = "Ajuste") }
        )
    }
}


@Preview(showSystemUi = true)
@Composable
fun OtraPantalla() {

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.weight(1f))

        Row(
            modifier = Modifier
                .padding(5.dp)
                .height(80.dp)
                .background(Color(196, 255, 194))
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly

        ) {

            Text(
                text = "item 1",
                modifier = Modifier
                    .background(Color(255, 255, 194))
                    .padding(10.dp)
            )

            Text(
                text = "item 2",
                modifier = Modifier
                    .background(Color(255, 194, 210))
                    .padding(10.dp)
            )

            Text(
                text = "item 3",
                modifier = Modifier
                    .background(Color(255, 231, 194))
                    .padding(10.dp)
            )
        }
        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = "pie de pagina",
            modifier = Modifier
                .background(Color.LightGray)
                .padding(12.dp)
        )
    }
}


@Preview(showSystemUi = true)
@Composable
fun PerfilScreen() {

    val intereses = listOf(
        "Ciclismo",
        "Programación",
        "UI/UX",
        "Música",
        "Viajes",
        "Gaming"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Spacer(modifier = Modifier.height(30.dp))

        Image(
            painter = painterResource(id = R.drawable.tecna),
            contentDescription = "Foto perfil",
            modifier = Modifier
                .size(110.dp)
                .clip(CircleShape)
                .align(Alignment.CenterHorizontally),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Juan Pérez",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Desarrollador Android apasionado por la tecnología y el diseño.",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            color = Color.DarkGray,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            EstadisticaItem("150", "Posts")
            EstadisticaItem("2.3K", "Seguidores")
            EstadisticaItem("980", "Likes")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            Button(
                onClick = {},
                modifier = Modifier.weight(1f)
            ) {
                Text("Seguir")
            }

            OutlinedButton(
                onClick = {},
                modifier = Modifier.weight(1f)
            ) {
                Text("Mensaje")
            }
        }

        Spacer(modifier = Modifier.height(28.dp))

        Text(
            text = "Intereses",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(14.dp))

        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            modifier = Modifier.height(120.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            items(intereses) { interes ->
                ChipItem(interes)
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Proyectos Recientes",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(12.dp))

        ProyectoCard()
    }
}

@Composable
fun EstadisticaItem(numero: String, titulo: String) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = numero,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = titulo,
            color = Color.Gray
        )
    }
}

@Composable
fun ChipItem(texto: String) {

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(20.dp))
            .background(Color.LightGray)
            .padding(horizontal = 16.dp, vertical = 10.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(text = texto)
    }
}

@Composable
fun ProyectoCard() {

    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFE0E0E0)
        )
    ) {

        Row{

            Image(
                painter = painterResource(id = R.drawable.tecna),
                contentDescription = "Proyecto",
                modifier = Modifier
                    .size(110.dp)
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {

                Text(
                    text = "App de Ciclismo",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "Aplicación para rastrear rutas de ciclismo con mapas y estadísticas.",
                    color = Color.DarkGray
                )

                Spacer(modifier = Modifier.height(12.dp))

                Button(
                    onClick = {},
                    modifier = Modifier.align(Alignment.End)
                ) {
                    Text("Ver más")
                }
            }
        }
    }
}