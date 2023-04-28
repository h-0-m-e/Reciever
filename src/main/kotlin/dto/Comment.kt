package dto

data class Comment(
    val id: Long,
    val authorId: Long,
    val postId: Long,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
)