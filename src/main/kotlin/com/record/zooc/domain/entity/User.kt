import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

// @Builder가 필요한 상황 찾아보기
// reflection 개념 찾아보기

@Entity
@Table(name = "user")
class User(
    role: String,
    everRecorded: Boolean = false,
    refreshToken: String,
    snsToken: String,
    snsType: String,
    userEmail: String? = null,
    profileImage: String? = null
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = 0
        protected set
    // 객체의 id를 null로 두고 데이터베이스에 insert일어날 때 생성되기 때문에 nullable이어야됨

    @Column
    var role: String = role
        protected set

    @Column(name = "user_email")
    var userEmail: String? = userEmail
        protected set

    @Column(name = "profile_image")
    var profileImage: String? = profileImage
        protected set

    @Column(name = "ever_recorded")
    var everRecorded: Boolean = everRecorded
        protected set

    @Column(name = "refresh_token")
    var refreshToken: String = refreshToken
        protected set

    @Column(name = "sns_token")
    var snsToken: String = snsToken
        protected set

    @Column(name = "sns_type")
    var snsType: String = snsType
        protected set

    fun updateUserRoleAndProfile(
        role: String? = null,
        profileImage: String? = null,
    ) {
        // role이 null이 아니면 this에 role 저장
        role?.let { this.role = it }
        profileImage?.let { this.profileImage = it }
    }

    fun userRecordedForTheFirstTime() {
        this.everRecorded = true
    }
}
