package com.record.zooc.domain.entity

import com.record.zooc.domain.entity.relation.UserFamilyRelation
import com.record.zooc.domain.entity.base.ModifiedTimeEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany

@Entity
class Family(
    code: String,
) : ModifiedTimeEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = 0
        protected set

    @Column
    val code: String = code

    @OneToMany(mappedBy = "family")
    var relationsWithUser: ArrayList<UserFamilyRelation> = ArrayList()
        protected set
}
