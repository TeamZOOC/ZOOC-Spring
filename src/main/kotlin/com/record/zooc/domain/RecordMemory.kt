package com.record.zooc.domain

import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity(name = "record_memory")
@DiscriminatorValue("Record_Memory")
class RecordMemory(
    id: Int,
    image: String,
    content: String,
    users: Users,
    family: Family,

) : Memory(id, image, content, users, family)
