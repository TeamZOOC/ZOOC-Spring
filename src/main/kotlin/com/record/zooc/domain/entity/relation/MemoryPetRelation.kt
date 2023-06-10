package com.record.zooc.domain.entity.relation

import com.record.zooc.domain.entity.Pet
import com.record.zooc.domain.entity.memory.Memory
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
class MemoryPetRelationId(
    memoryId: Long?,
    petId: Long?
) : Serializable {
    // 사실 이게 notnull인게 맞는데... Memory에 id가 nullable이다보니까...

    @Column(name = "memory_id", nullable = false)
    val memoryId = memoryId

    @Column(name = "pet_id", nullable = false)
    val petId = petId

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
@Table(name = "memory_pet")
class MemoryPetRelation(memory: Memory, pet: Pet) {

    @EmbeddedId
    var memoryPetId: MemoryPetRelationId = MemoryPetRelationId(memory.id, pet.id)
        protected set

    @MapsId("memory_id")
    @ManyToOne
    @JoinColumn(name = "memory_id")
    var memory: Memory = memory
        protected set

    @MapsId("pet_id")
    @ManyToOne
    @JoinColumn(name = "pet_id")
    var pet: Pet = pet
        protected set
}
