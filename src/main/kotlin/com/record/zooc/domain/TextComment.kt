package com.record.zooc.domain

import jakarta.persistence.Column
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity(name = "text_comment")
@DiscriminatorValue("TextComment")
class TextComment(
    @Column(name = "content", nullable = false)
    var content: String? = null,
) : Comment()
