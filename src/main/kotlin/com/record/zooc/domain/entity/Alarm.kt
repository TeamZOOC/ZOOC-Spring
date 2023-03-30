import com.record.zooc.domain.entity.BaseTimeEntityCreated
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "alarm")
class Alarm(
    userId: Long,
    writerId: Long,
    familyId: Long,
    recordId: Long,
) : BaseTimeEntityCreated() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = 0
        protected set

    @Column(name = "user_id")
    var userId: Long = userId
        protected set

    @Column(name = "writer_id")
    var writerId: Long = writerId
        protected set

    @Column(name = "family_id")
    var familyId: Long = familyId
        protected set

    @Column(name = "record_id")
    var recordId: Long = recordId
        protected set
}
