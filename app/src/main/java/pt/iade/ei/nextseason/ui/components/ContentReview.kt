package pt.iade.ei.nextseason.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pt.iade.ei.nextseason.R
import pt.iade.ei.nextseason.models.Review
import pt.iade.ei.nextseason.test.generateReviewListExample

@Composable
fun ContentReview(review: Review){
    HorizontalDivider(
        thickness = 1.dp,
    )
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 20.dp, horizontal = 10.dp)
    ){
        Image(
            painter = painterResource(R.drawable.user_placeholder),
            contentDescription = "User profile picture",
            modifier = Modifier
                .padding(end = 10.dp)
                .height(60.dp)
                .aspectRatio(1f)
                .clip(shape = RoundedCornerShape(100))
        )
        Column {
            Text(
                modifier = Modifier.padding(bottom = 2.dp),
                text = review.user.name,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            )
            Stars(rating = review.rating.toFloat(), size = 16.dp)
            Text(
                modifier = Modifier.padding(top = 2.dp),
                text = review.comment
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ReviewPreview(){
    ContentReview(generateReviewListExample().first())
}