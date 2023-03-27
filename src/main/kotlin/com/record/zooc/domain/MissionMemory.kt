package com.record.zooc.domain

import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne

@Entity
@DiscriminatorValue("MISSIONMEMORY")
class MissionMemory : Memory() {
    @OneToOne
    @JoinColumn(name = "mission_id")
    val mission: Mission? = null
}
