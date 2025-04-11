package com.example.sexygaertner.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil3.compose.rememberAsyncImagePainter
import com.example.merys_gaertner.ui.components.GaertnerCard
import com.example.sexygaertner.data.Gaertner

@Composable
fun GaertnerListeScreen(
    gaertnerList: List<Gaertner>,
    onSelect: (Gaertner) -> Unit,
    navController: NavHostController
) {
    Box(modifier = Modifier.fillMaxSize()) {

        Image(
            painter = rememberAsyncImagePainter("https://i.pinimg.com/originals/5d/ec/cb/5deccb320fe20f4095dbca54236df3ec.jpg"),
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 16.dp)
        ) {
            Button(
                onClick = { navController.popBackStack() },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50)),
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(horizontal = 16.dp)
            ) {
                Text("Zurück zur Startseite")
            }

            Spacer(modifier = Modifier.height(16.dp))

            LazyColumn(
                modifier = Modifier.padding(bottom = 16.dp)
            ) {
                items(gaertnerList) { gaertner ->
                    GaertnerCard(gaertner = gaertner) {
                        onSelect(gaertner)
                    }
                }
            }
        }
    }
}