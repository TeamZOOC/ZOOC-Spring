package com.record.zooc.domain.entity.memory

import com.record.zooc.domain.entity.Account
import jakarta.persistence.DiscriminatorValue

@DiscriminatorValue("Record")
class Recordmemory(
    image: String,
    content: String,
    writer: Account
) : Memory(
    image,
    content,
    writer
)
