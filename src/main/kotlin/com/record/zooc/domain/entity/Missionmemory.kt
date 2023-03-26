import jakarta.persistence.DiscriminatorValue

@DiscriminatorValue("Mission")
class Missionmemory(
    image: String,
    content: String
) : Memory(
    image,
    content
)
