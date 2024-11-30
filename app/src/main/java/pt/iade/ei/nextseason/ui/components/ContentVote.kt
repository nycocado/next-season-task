package pt.iade.ei.nextseason.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import pt.iade.ei.nextseason.R
import pt.iade.ei.nextseason.models.ContentItem
import pt.iade.ei.nextseason.test.generateContentItemListExample

@Composable
fun ContentVote(
    item: ContentItem
) {
    var votes by remember { mutableIntStateOf(item.votes) }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Surface(
            onClick = {
                item.votes++
                votes++
            },
            color = Color.Transparent
        ) {
            Image(
                painter = painterResource(R.drawable.keyboard_arrow_up),
                contentDescription = "Up vote"
            )
        }
        Text(
            text = votes.toString()
        )
        Surface(
            onClick = {
                item.votes--
                votes--
            },
            color = Color.Transparent
        ) {
            Image(
                painter = painterResource(R.drawable.keyboard_arrow_down),
                contentDescription = "Down vote"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ContentVotePreview() {
    ContentVote(generateContentItemListExample().first())
}