package pt.iade.ei.nextseason.models

import java.io.Serializable
import java.time.LocalDateTime

data class Review(
    var id: Int?,
    val user: User,
    val comment: String,
    val rating: Int,
    val publishedDate: LocalDateTime
): Serializable
