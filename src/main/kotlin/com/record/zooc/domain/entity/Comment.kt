import com.record.zooc.domain.entity.time.ModifiedTimeEntity
import jakarta.persistence.Column
import jakarta.persistence.DiscriminatorColumn
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Inheritance
import jakarta.persistence.InheritanceType
import jakarta.persistence.Table

@DiscriminatorColumn(name = "comment_type")
@Entity
@Table(name = "comment")
@Inheritance(strategy = InheritanceType.JOINED)
class Comment(
    content: String,
    writerId: Long,
    recordId: Int,

) : ModifiedTimeEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = 0
        protected set

    @Column
    var content: String = content
        protected set

    @Column
    var writer: Long = writerId
        protected set

    @Column(name = "record_id")
    var recordId: Int = recordId
        protected set

    fun updateContent(
        content: String,
    ) {
        this.content = content
    }
}
