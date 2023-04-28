package dto

import enumer.AttachmentType

data class Attachment(
    val url: String,
    val description: String?,
    val type: AttachmentType,
)