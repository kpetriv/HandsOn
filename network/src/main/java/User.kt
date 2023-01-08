import kotlinx.serialization.Serializable

@Serializable
data class User(
    val name: String,
    val surname: String,
)