import com.record.zooc.domain.entity.BaseTimeEntityModified
import jakarta.persistence.Column
import jakarta.persistence.DiscriminatorColumn
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Inheritance
import jakarta.persistence.InheritanceType

@DiscriminatorColumn(name = "mission_type")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
class Memory(

    @Column
    var image: String,

    @Column
    var content: String,
) : BaseTimeEntityModified() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0; // ㅜㅜ 이거 어카지...
}
