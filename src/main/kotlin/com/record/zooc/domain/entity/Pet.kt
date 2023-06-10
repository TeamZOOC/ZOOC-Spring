package com.record.zooc.domain.entity

import com.record.zooc.domain.entity.relation.MemoryPetRelation
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import jakarta.persistence.Table

@Entity
@Table(name = "pet")
class Pet(
    name: String,
    profileImage: String? = null
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column
    var name: String = name
        protected set

    @Column(name = "profile_image")
    var profileImage: String? = profileImage
        protected set

    @OneToMany(mappedBy = "pet")
    var relationsWithMemory: ArrayList<MemoryPetRelation> = ArrayList()
        protected set
}
