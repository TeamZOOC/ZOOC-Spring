package com.record.zooc.domain.entity.comment

import jakarta.persistence.DiscriminatorValue

@DiscriminatorValue("Text")
class Textcomment(
    content: String,
    writerId: Long,
    recordId: Int,
) : Comment(content, writerId, recordId)
