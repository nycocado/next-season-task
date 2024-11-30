package pt.iade.ei.nextseason.models

import java.io.Serializable
import java.time.LocalDate

data class ContentItem(
    var id: Int?,
    val title: String,
    val description: String,
    val banner: String,
    val cover: String,
    var votes: Int = 0,
    val genre: String,
    val releaseDate: LocalDate,
    val duration: Int,
    val reviews: List<Review>
): Serializable {
    fun reviewsAverage(): Float {
        var sum = 0
        for (review in reviews) {
            sum += review.rating
        }

        return sum.toFloat() / reviews.size
    }
}
