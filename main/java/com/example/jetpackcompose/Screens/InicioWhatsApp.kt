package com.example.jetpackcompose.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.example.jetpackcompose.Navigation.AppScreen
import com.example.jetpackcompose.R

@Composable
fun Persona(navController: NavController, imagen: Int, nombre: String):String {
    Row(
        modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
            .height(50.dp)
            .clickable { navController.navigate(route = AppScreen.ChatScreen.route+ "/$nombre") },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(imagen),
            contentDescription = "Persona Image",
            modifier = Modifier
                .background(Color.White)
                .size(40.dp)
        )
        Text(
            text = nombre,
            modifier = Modifier
                .background(Color.White)
                .weight(1f)
                .padding(5.dp),
            style = TextStyle(fontSize = 20.sp)
        )
    }
    return nombre
}


@Composable
fun AppInicio(navController: NavController) {
    Column(modifier = Modifier) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(color = colorResource(id = R.color.DarkGreen))
        ) {
            Text(
                text = stringResource(R.string.Inicio),
                modifier = Modifier
                    .weight(2f)
                    .align(Alignment.CenterVertically)
                    .padding(5.dp),
                color = Color.White,
                style = TextStyle(fontSize = 24.sp)
            )

            Image(
                painter = painterResource(R.drawable.camara),
                contentDescription = "Camera Icon",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .weight(1f)
                    .size(20.dp),
            )

            Icon(
                imageVector = Icons.Filled.Search,
                contentDescription = "Search Icon",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .weight(1f),
                tint = Color.White
            )

            Icon(
                imageVector = Icons.Filled.Menu,
                contentDescription = "Menu Icon",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .weight(1f),
                tint = Color.White
            )
        }

        Persona(navController, imagen = R.drawable.wassap2, nombre = stringResource(R.string.persona1))
        Persona(navController, imagen = R.drawable.wassap2, nombre = stringResource(R.string.persona2))
        Persona(navController, imagen = R.drawable.wassap2, nombre = stringResource(R.string.persona3))
        Persona(navController, imagen = R.drawable.wassap2, nombre = stringResource(R.string.persona4))
        Persona(navController, imagen = R.drawable.wassap2, nombre = stringResource(R.string.persona5))
        Persona(navController, imagen = R.drawable.wassap2, nombre = stringResource(R.string.persona6))
        Persona(navController, imagen = R.drawable.wassap2, nombre = stringResource(R.string.persona7))
        Persona(navController, imagen = R.drawable.wassap2, nombre = stringResource(R.string.persona8))
        Persona(navController, imagen = R.drawable.wassap2, nombre = stringResource(R.string.persona9))
        Persona(navController, imagen = R.drawable.wassap2, nombre = stringResource(R.string.persona10))
        Persona(navController, imagen = R.drawable.wassap2, nombre = stringResource(R.string.persona11))
        Persona(navController, imagen = R.drawable.wassap2, nombre = stringResource(R.string.persona12))
        Persona(navController, imagen = R.drawable.wassap2, nombre = stringResource(R.string.persona13))
        Persona(navController, imagen = R.drawable.wassap2, nombre = stringResource(R.string.persona14))



    }

}



