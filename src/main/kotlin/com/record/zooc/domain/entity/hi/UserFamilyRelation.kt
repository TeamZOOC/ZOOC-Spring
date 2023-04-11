import jakarta.persistence.Column
import jakarta.persistence.Embeddable
import jakarta.persistence.EmbeddedId
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import java.io.Serializable

@Embeddable
class UserFamilyRelationId(
    userId: Long?,
    familyId: Long?
) : Serializable {
    // 사실 이게 notnull인게 맞는데... Memory에 id가 nullable이다보니까...

    @Column(name = "user_id", nullable = false)
    val userId = userId

    @Column(name = "family_id", nullable = false)
    val familyId = familyId

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
        // 구현 예정
    }

    override fun hashCode(): Int {
        return super.hashCode()
        // 구현 예정
    }
}

@Entity
@Table(name = "user_family")
class UserFamilyRelation(user: User, family: Family) {

    @EmbeddedId
    var userFamilyId = UserFamilyRelationId(user.id, family.id)
        protected set

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    var user: User = user
        protected set

    @Id
    @ManyToOne
    @JoinColumn(name = "family_id")
    var family: Family = family
        protected set
}
