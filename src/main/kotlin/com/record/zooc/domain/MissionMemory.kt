package com.record.zooc.domain

import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne

@Entity(name = "mission_memory")
@DiscriminatorValue("MissionMemory")
class MissionMemory(
    id: Int,
    image: String,
    content: String,
    users: Users,
    family: Family,

    @OneToOne
    @JoinColumn(name = "mission_id")
    val mission: Mission,

) : Memory(id, image, content, users, family)
