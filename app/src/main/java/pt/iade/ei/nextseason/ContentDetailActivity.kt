package pt.iade.ei.nextseason

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import pt.iade.ei.nextseason.models.ContentItem
import pt.iade.ei.nextseason.ui.theme.NextSeasonTheme
import pt.iade.ei.nextseason.views.ContentDetailView

class ContentDetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val item: ContentItem = intent.getSerializableExtra("item") as ContentItem
            NextSeasonTheme {
                ContentDetailView(item = item){
                    finish()
                }
            }
        }
    }
}