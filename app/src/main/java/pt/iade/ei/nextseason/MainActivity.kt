package pt.iade.ei.nextseason

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import pt.iade.ei.nextseason.ui.theme.NextSeasonTheme
import pt.iade.ei.nextseason.views.MainView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NextSeasonTheme {
                MainView()
            }
        }
    }
}