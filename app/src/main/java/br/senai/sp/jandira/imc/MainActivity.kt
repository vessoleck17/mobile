package br.senai.sp.jandira.imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.imc.ui.theme.IMCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IMCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .background(
                    color = Color(0xFFC24C4C)
                )
                .fillMaxWidth()
                .height(200.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.imc),
                contentDescription = "",
                modifier = Modifier
                    .padding(60.dp)
                    .offset(x = 90.dp, y = -50.dp)
            )
            Text(
                text = "Calculadora IMC",
                fontSize = 27.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.offset(x = 80.dp, y = 100.dp)
            )
        }
        Column {
            Card(
                modifier = Modifier
                    .width(300.dp)
                    .height(450.dp)
                    .offset(x = 0.dp, y = -30.dp),

                colors = CardDefaults.cardColors(containerColor = Color(0xFFE7E7E7))
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                ) {
                    Text(
                        text = "Seus Dados",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Red,
                        modifier = Modifier
                            .offset(x = 60.dp, y = 5.dp)
                    )
                    Text(
                        text = "Seu Peso:",
                        fontSize = 17.sp,
                        color = Color.Red,
                        modifier = Modifier
                            .offset(x = 0.dp, y = 47.dp)
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .padding(top = 55.dp)
                            .fillMaxWidth(),
                        colors = OutlinedTextFieldDefaults
                            .colors(
                                focusedContainerColor = Color.White,
                                unfocusedContainerColor = Color.White,
                                unfocusedBorderColor = Color(0xFFC24C4C),
                                focusedBorderColor = Color(0xFFC24C4C)

                            ),
                        placeholder = {
                            Text(text = "Sua altura em cm...")
                        }
                    )

                    Text(
                        text = "Sua Altura:",
                        fontSize = 17.sp,
                        color = Color.Red,
                        modifier = Modifier
                            .offset(x = 0.dp, y = 17.dp)
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .padding(top = 20.dp)
                            .fillMaxWidth(),
                        colors = OutlinedTextFieldDefaults
                            .colors(
                                focusedContainerColor = Color.White,
                                unfocusedContainerColor = Color.White,
                                unfocusedBorderColor = Color(0xFFC24C4C),
                                focusedBorderColor = Color(0xFFC24C4C)
                            ),
                        placeholder = {
                            Text(
                                text = "Sua altura em cm..."
                            )
                        }
                    )
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .padding(top = 50.dp)
                            .fillMaxWidth()
                            .height(60.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFC24C4C))
                    ) {

                        Text(text = "CALCULAR", fontSize = 20.sp)
                    }
                }


            }
        }

        Card(
            modifier = Modifier
                .height(90.dp)
                .width(300.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xAB36AA13))
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(top = 15.dp, start = 30.dp)
            ) {
                Column {
                    Text(
                        text = "Resultado",
                        fontSize = 20.sp,
                        color = Color.White
                    )
                    Text(
                        text = "Peso Ideal",
                        fontSize = 25.sp,
                        color = Color.White
                    )
                }
                Text(
                    text = "21.3",
                    color = Color.White,
                    fontSize = 45.sp,
                    modifier = Modifier
                        .padding(start = 30.dp)
                )
            }
        }


    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    IMCTheme {
        Greeting()
    }
}
