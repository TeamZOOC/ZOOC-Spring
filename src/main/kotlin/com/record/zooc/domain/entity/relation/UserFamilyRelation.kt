package com.record.zooc.domain.entity.relation

import com.record.zooc.domain.entity.Family
import com.record.zooc.domain.entity.Account
import jakarta.persistence.Column
import jakarta.persistence.Embeddable
import jakarta.persistence.EmbeddedId
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.MapsId
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
class UserFamilyRelation(account: Account, family: Family) {

    @EmbeddedId
    var userFamilyId = UserFamilyRelationId(account.id, family.id)
        protected set

    @MapsId("user_id")
    @ManyToOne
    @JoinColumn(name = "user_id")
    var account: Account = account
        protected set

    @MapsId("family_id")
    @ManyToOne
    @JoinColumn(name = "family_id")
    var family: Family = family
        protected set
}
