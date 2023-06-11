package com.record.zooc.domain.entity.memory

import com.record.zooc.domain.entity.Account
import jakarta.persistence.Column
import jakarta.persistence.DiscriminatorValue

@DiscriminatorValue("Mission")
class Missionmemory(
    image: String,
    content: String,
    missionId: Int,
    writer: Account
) : Memory(
    image,
    content,
    writer
) {
    @Column(name = "mission_id")
    var missionId: Int = missionId
        protected set
}
