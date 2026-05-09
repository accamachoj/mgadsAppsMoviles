package com.jahzeelcubides.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
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