import com.record.zooc.domain.entity.BaseTimeEntityModified
import jakarta.persistence.DiscriminatorColumn
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Inheritance
import jakarta.persistence.InheritanceType

@DiscriminatorColumn(name = "comment_type")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
class Comment(
) : BaseTimeEntityModified() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = 0
        protected set
}
