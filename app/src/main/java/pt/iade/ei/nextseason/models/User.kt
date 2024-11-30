package pt.iade.ei.nextseason.models

import java.io.Serializable

data class User(
    val id: Int?,
    val name: String
) : Serializable
