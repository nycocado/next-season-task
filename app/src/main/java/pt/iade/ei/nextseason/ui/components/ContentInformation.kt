package pt.iade.ei.nextseason.ui.components

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pt.iade.ei.nextseason.models.ContentItem
import pt.iade.ei.nextseason.test.generateContentItemListExample
import java.time.format.DateTimeFormatter

@SuppressLint("DefaultLocale")
@Composable
fun ContentInformation(
    item: ContentItem
) {
    Column(
        modifier = Modifier.padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier.padding(bottom = 25.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.weight(1f),
                text = item.genre,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Text(
                text = item.releaseDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }
        Text(
            modifier = Modifier.padding(bottom = 25.dp),
            text = item.description,
            fontSize = 16.sp,
        )
        val hours = item.duration / 60
        val hoursString = if (hours > 0) "${hours}h" else ""
        val minutes = item.duration % 60
        val minutesString = if (minutes > 0) "${minutes}m" else ""
        Text(
            modifier = Modifier.padding(bottom = 25.dp),
            text = "$hoursString $minutesString",
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                modifier = Modifier.weight(1f),
                text = item.reviews.size.toString() + " reviews",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Stars(item.reviewsAverage())
            Text(
                modifier = Modifier.padding(start = 8.dp),
                text = String.format("%.1f", item.reviewsAverage()),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ContentInformationPreview() {
    ContentInformation(
        generateContentItemListExample().first()
    )
}