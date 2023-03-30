import jakarta.persistence.Column
import jakarta.persistence.DiscriminatorValue

@DiscriminatorValue("Mission")
class Missionmemory(
    image: String,
    content: String,
    missionId: Int,
) : Memory(
    image,
    content
) {
    @Column(name = "mission_id")
    var missionId: Int = missionId
        protected set
}
