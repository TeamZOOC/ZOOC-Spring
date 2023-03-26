import jakarta.persistence.DiscriminatorValue

@DiscriminatorValue("Emoji")
class Emojicomment(
    emoji: Int
) : Comment()
