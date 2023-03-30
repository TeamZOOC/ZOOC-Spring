import jakarta.persistence.DiscriminatorValue

@DiscriminatorValue("Text")
class Textcomment(
    content: String,
    writerId: Int,
    recordId: Int,
) : Comment(content, writerId, recordId)
