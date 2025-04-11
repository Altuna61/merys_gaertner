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
            "~Der heiße Italiener mit dem grünen Daumen~",
            "https://i.pinimg.com/originals/08/2e/73/082e73026efe75bf4f3e9aba0d7f7118.jpg",
            //"~Der Italiener mit dem grünen Daumen~",
            //"https://img.listando.de/3840x0/landing-page/gartner_banner.jpg",
            "+4915151213728"
        ), Gaertner(
            2,
            "Jan",
            "~Der stille Pflanzenflüsterer~",
            "https://i.pinimg.com/736x/f8/48/96/f84896dee61fe1f5cb335793bbb36522--fit-men-pretty-boys.jpg",
            //"https://th.bing.com/th/id/R.0081511728391f2b44042faa3a23d021?rik=GEyq7yWitHfevQ&pid=ImgRaw&r=0",
            "+49 152 98765432"
        ), Gaertner(
            3,
            "Carlos",
            "~Südamerikanisches Feuer trifft Blütenpracht~",
            "https://as1.ftcdn.net/v2/jpg/01/39/18/02/1000_F_139180276_VMjIlfutB1W8vrsNxfJ9nBPDTeYSjXV5.jpg",
            //"https://thumbs.dreamstime.com/z/handsome-man-dressed-lawn-mowing-outfit-handsome-man-dressed-lawn-mowing-outfit-lawn-mower-168901755.jpg",
            "+49 160 11223344"
        ), Gaertner(
            4,
            "Finn",
            "~Nordischer Charme trifft auf Gartenschere~",
            "https://i.pinimg.com/originals/40/d1/5a/40d15a82bdbe8123ac3028da1dc62ccf.jpg",
            //"https://thumbs.dreamstime.com/z/gardener-working-garden-young-cutting-bushes-clippers-60366833.jpg",
            "+49 170 44556677"
        ), Gaertner(
            5,
            "Sven",
            "~Der Muskelprotz aus dem Rosengarten~",
            "https://th.bing.com/th/id/OIP.DF9BtMh2_6h8jCLuCzxwKgAAAA?w=411&h=600&rs=1&pid=ImgDetMain",
            //"https://thumbs.dreamstime.com/z/giardiniere-pronto-funzionare-55482949.jpg",
            "+49 176 99887766"
        ), Gaertner(
            6,
            "Noah",
            //"~Der sanfte Gärtner, der lieber mit Pflanzen flüstert als redet~",
            "https://media.istockphoto.com/id/1076878128/de/foto/junger-attraktiver-mann-tr%C3%A4gt-eine-holzkiste-mit-pflanzen-und-blumen-er-schaut-sie-an-und.jpg?s=612x612&w=0&k=20&c=BSG2sn2upMPZHQjBviqUTCulNbJPG2F_ZyL8iY__q9M=",
            "https://thumbs.dreamstime.com/z/jardineiro-aplicando-fertilizante-inseticida-ao-seu-bandido-usando-pulverizador-que-aplica-adubo-252722465.jpg",
            "+49 157 12345678"
        ), Gaertner(
            7,
            "Adrien",
            "~Französischer Chic zwischen Lavendel und Leidenschaft~",
            "https://img.freepik.com/premium-photo/happy-man-smelling-his-lavender-plant_13339-118271.jpg",
            //"https://c8.alamy.com/compes/d9j9f3/trabajador-manual-recortar-un-arbol-en-un-jardin-d9j9f3.jpg",
            "+49 159 87654321"
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







