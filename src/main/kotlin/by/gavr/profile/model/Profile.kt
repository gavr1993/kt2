package profile.model

class Profile(
    private val id: Int,
    private val login: String,
    private val name: String,
    private val surname: String,
    private val status: String,
    private val avatar: Int
) {
    val fullName: String
        get() {
            return "$name $surname"
        }
}