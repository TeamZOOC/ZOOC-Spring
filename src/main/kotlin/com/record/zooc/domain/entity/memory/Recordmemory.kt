package com.record.zooc.domain.entity.memory

import jakarta.persistence.DiscriminatorValue

@DiscriminatorValue("Record")
class Recordmemory(
    image: String,
    content: String
) : Memory(
    image,
    content
)
