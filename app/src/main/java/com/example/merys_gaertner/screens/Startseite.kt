package com.example.merys_gaertner.screens

import coil3.compose.rememberAsyncImagePainter
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun Startseite(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Image(
            painter = rememberAsyncImagePainter("https://i.pinimg.com/originals/5d/ec/cb/5deccb320fe20f4095dbca54236df3ec.jpg"),
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Mery´s Gartenparadies",
                style = MaterialTheme.typography.headlineLarge.copy(fontWeight = FontWeight.Bold),
                color = Color(0xFF006400),
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Text(
                text = "Willkommen im Gartenparadies – miete dir deinen Traumgärtner!",
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF006400)
                ),
                modifier = Modifier.padding(bottom = 32.dp),
                textAlign = TextAlign.Center
            )
            Text(
                text = "Tauche ein in die Welt der grünen Oasen und lasse dich von unseren erfahrenen Gärtnern inspirieren! Bei Mery’s Gartenparadies kannst du ganz einfach einen Gärtner mieten, der dir bei der Gestaltung, Pflege und Verschönerung deines Gartens hilft. ",
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF006400)
                ),
                modifier = Modifier.padding(bottom = 32.dp),
                textAlign = TextAlign.Center
            )

            Button(
                onClick = { navController.navigate("liste") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50))
            ) {
                Text("Miete deinen Gärtner 🌱")
            }
        }
    }
}
