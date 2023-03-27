package com.record.zooc.domain

import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity
@DiscriminatorValue("RECORDMEMORY")
class RecordMemory : Memory()
