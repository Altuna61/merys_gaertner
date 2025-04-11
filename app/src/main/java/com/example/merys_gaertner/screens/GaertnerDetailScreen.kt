package com.example.merys_gaertner.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil3.compose.rememberAsyncImagePainter
import com.example.sexygaertner.data.Gaertner
import android.content.Intent
import android.content.pm.PackageManager
import android.widget.Toast
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContextCompat
import androidx.core.net.toUri

@Composable
fun GaertnerDetailScreen(gaertner: Gaertner, navController: NavHostController) {
    val context = LocalContext.current
    Image(
        painter = rememberAsyncImagePainter("https://i.pinimg.com/originals/5d/ec/cb/5deccb320fe20f4095dbca54236df3ec.jpg"),
        contentDescription = "Background",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
    Box(modifier = Modifier.fillMaxSize()) {

        Text(
            text = "🌱${gaertner.name}",
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.TopEnd)
        )

        Column(
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.TopStart)
                .verticalScroll(rememberScrollState()),
        ) {
            Spacer(Modifier.height(100.dp))
            Image(
                painter = rememberAsyncImagePainter(gaertner.bildUrl),
                contentDescription = gaertner.name,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Spacer(Modifier.height(50.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally)
            ) {
                Text(
                    text = gaertner.beschreibung,
                    style = MaterialTheme.typography.bodyLarge,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.align(Alignment.Center)
                )
            }
            Spacer(Modifier.height(24.dp))
            Row {
                Button(
                    onClick = {
                        if (ContextCompat.checkSelfPermission(
                                context, android.Manifest.permission.CALL_PHONE
                            ) == PackageManager.PERMISSION_GRANTED
                        ) {
                            val intent = Intent(Intent.ACTION_CALL).apply {
                                data = "tel:${gaertner.telefonnummer}".toUri()
                            }
                            context.startActivity(intent)
                        } else {
                            Toast.makeText(
                                context,
                                "Bitte erlaube Telefonanrufe in den Einstellungen",
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    }, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50))
                ) { Text("📞 Jetzt anrufen") }




                Spacer(Modifier.padding(20.dp))


                Button(
                    onClick = {
                        // spezielle URI(.toUri() wandelt String in Uri-Obj) für SMS, die Android erkennt und an die passende App (SMS-App) weiterreicht
                        val smsUri = "smsto:${gaertner.telefonnummer}".toUri()
                        // intent: „Ich möchte etwas tun – in diesem Fall: Eine SMS an diese Nummer senden.“
                        val intent = Intent(Intent.ACTION_SENDTO, smsUri)
                        context.startActivity(intent)
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50)),
                ) {
                    Text("✉️ SMS verschicken")
                }
            }
        }

        Button(
            onClick = { navController.popBackStack() },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50)),
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(16.dp)
        ) {
            Text("Zurück zur Auswahl")
        }

    }
}
