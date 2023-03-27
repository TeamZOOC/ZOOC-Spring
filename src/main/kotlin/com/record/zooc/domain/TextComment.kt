package com.record.zooc.domain

import jakarta.persistence.Column
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity
@DiscriminatorValue("TEXTCOMMENT")
class TextComment : Comment() {
    @Column(name = "content", nullable = false)
    var content: String? = null
}
