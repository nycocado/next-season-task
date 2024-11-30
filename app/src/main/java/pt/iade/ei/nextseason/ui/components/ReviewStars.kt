package pt.iade.ei.nextseason.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pt.iade.ei.nextseason.models.ContentItem
import pt.iade.ei.nextseason.test.generateContentItemListExample

@Composable
fun ReviewStars(
    item: ContentItem
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Stars(item.reviewsAverage())
        Text(
            text = "${item.reviews.size} reviews",
            modifier = Modifier.padding(
                start = 15.dp
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ReviewStarsPreview() {
    ReviewStars(
        generateContentItemListExample().first()
    )
}