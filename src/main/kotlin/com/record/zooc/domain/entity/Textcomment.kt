import jakarta.persistence.DiscriminatorValue

@DiscriminatorValue("Text")
class Textcomment(
    content: String
) : Comment()
