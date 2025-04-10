package com.example.sexygaertner.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil3.compose.rememberAsyncImagePainter
import com.example.merys_gaertner.ui.components.GaertnerCard
import com.example.sexygaertner.data.Gaertner

@Composable
fun GaertnerListeScreen(gaertnerList: List<Gaertner>, onSelect: (Gaertner) -> Unit) {
    Image(
        painter = rememberAsyncImagePainter("https://i.pinimg.com/originals/5d/ec/cb/5deccb320fe20f4095dbca54236df3ec.jpg"),
        contentDescription = "Background",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
    LazyColumn {
        items(gaertnerList) { gaertner ->
            GaertnerCard(gaertner = gaertner) {
                onSelect(gaertner)
            }
        }
    }
}
