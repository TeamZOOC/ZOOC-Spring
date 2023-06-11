package com.record.zooc.domain.entity.memory

import com.record.zooc.domain.entity.Account
import com.record.zooc.domain.entity.relation.MemoryPetRelation
import com.record.zooc.domain.entity.base.ModifiedTimeEntity
import jakarta.persistence.Column
import jakarta.persistence.DiscriminatorColumn
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Inheritance
import jakarta.persistence.InheritanceType
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToMany
import jakarta.persistence.OneToOne
import jakarta.persistence.Table

@DiscriminatorColumn(name = "memory_type")
@Entity
@Table(name = "memory")
@Inheritance(strategy = InheritanceType.JOINED)
class Memory(
    image: String,
    content: String,
    writer: Account
) : ModifiedTimeEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = 0
        protected set

    @Column
    var image: String = image
        protected set

    @Column
    var content: String = content
        protected set

    @OneToMany(mappedBy = "memory")
    @JoinColumn(name = "memory_pet")
    var relationsWithPet: ArrayList<MemoryPetRelation> = ArrayList()
        protected set

    @OneToOne
    @JoinColumn(name = "writer_id")
    var writer: Account = writer
        protected set
}
