
package com.example.jetpackcompose.Screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.jetpackcompose.Navigation.AppScreen
import com.example.jetpackcompose.R


@Composable
fun AppChat(navControlador: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Image(
            painter = painterResource(R.drawable.wassapfondo),
            contentDescription = "WassapFondo",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column {
            Row(
                modifier = Modifier
                    .background(colorResource(id = R.color.DarkGreen))
                    .fillMaxWidth()
                    .height(50.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "",
                    modifier = Modifier
                        .width(20.dp)
                        .weight(0.5f)
                        .clickable { navControlador.navigate(route = AppScreen.InicioScreen.route) }
                    ,tint = Color.White
                )
                Image(
                    painter = painterResource(id = R.drawable.wassap2),
                    contentDescription = "Persona Image",
                    modifier = Modifier
                        .weight(1f)
                        .clip(CircleShape)
                        .background(colorResource(id = R.color.DarkGreen))
                        .size(40.dp)
                )
                Column(modifier = Modifier.weight(5f)) {
                    Text(
                        text = "AAAA",
                        modifier = Modifier
                            .background(colorResource(id = R.color.DarkGreen))
                            .clickable { },
                        color = Color.White,
                        style = TextStyle(fontSize = 20.sp)
                    )
                    Text(
                        text = "escribiendo...",
                        modifier = Modifier
                            .background(colorResource(id = R.color.DarkGreen))
                            .clickable { }
                            .padding(0.dp, 3.dp, 0.dp, 0.dp),
                        color = Color.White,
                        style = TextStyle(fontSize = 9.sp)
                    )
                }
            }
            msg()
            msg()
            msg()

        }



    }
}

@Composable
fun msg(){
        Text(
            modifier = Modifier
                .padding(8.dp)
                .background(Color.LightGray),
            style = TextStyle(fontSize = 20.sp),
            text = "Lorem ipsumorem ipsum\nLorem ipsumLorem ipsum"
        )
    }



