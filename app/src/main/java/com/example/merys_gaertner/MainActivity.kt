package com.example.merys_gaertner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.merys_gaertner.ui.theme.Merys_gaertnerTheme
import com.example.sexygaertner.data.Gaertner
import com.example.sexygaertner.navigation.AppNavigation

class MainActivity : ComponentActivity() {
    private val gaertnerList = listOf(
        Gaertner(
            1,
            "Michele",
            "Der heiße Italiener mit dem grünen Daumen",
            "https://i.pinimg.com/originals/08/2e/73/082e73026efe75bf4f3e9aba0d7f7118.jpg"
        ), Gaertner(
            2,
            "Jan",
            "Der stille Pflanzenflüsterer",
            "https://i.pinimg.com/736x/f8/48/96/f84896dee61fe1f5cb335793bbb36522--fit-men-pretty-boys.jpg"
        ), Gaertner(
            3,
            "Carlos",
            "Südamerikanisches Feuer trifft Blütenpracht",
            "https://as1.ftcdn.net/v2/jpg/01/39/18/02/1000_F_139180276_VMjIlfutB1W8vrsNxfJ9nBPDTeYSjXV5.jpg"
        ), Gaertner(
            4,
            "Finn",
            "Nordischer Charme trifft auf Gartenschere",
            "https://i.pinimg.com/originals/40/d1/5a/40d15a82bdbe8123ac3028da1dc62ccf.jpg"
        ), Gaertner(
            5,
            "Sven",
            "Der Muskelprotz aus dem Rosengarten",
            "https://th.bing.com/th/id/OIP.DF9BtMh2_6h8jCLuCzxwKgAAAA?w=411&h=600&rs=1&pid=ImgDetMain"
        ), Gaertner(
            6,
            "Noah",
            "Der sanfte Gärtner, der lieber mit Pflanzen flüstert als redet",
            "https://media.istockphoto.com/id/1076878128/de/foto/junger-attraktiver-mann-tr%C3%A4gt-eine-holzkiste-mit-pflanzen-und-blumen-er-schaut-sie-an-und.jpg?s=612x612&w=0&k=20&c=BSG2sn2upMPZHQjBviqUTCulNbJPG2F_ZyL8iY__q9M="
        ), Gaertner(
            7,
            "Adrien",
            "Französischer Chic zwischen Lavendel und Leidenschaft",
            "https://img.freepik.com/premium-photo/happy-man-smelling-his-lavender-plant_13339-118271.jpg"
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Merys_gaertnerTheme {
                val navController = rememberNavController()
                AppNavigation(navController, gaertnerList)
            }
        }
    }
}







