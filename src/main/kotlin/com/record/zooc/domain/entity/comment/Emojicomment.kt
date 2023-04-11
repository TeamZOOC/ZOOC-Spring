package com.record.zooc.domain.entity.comment

import jakarta.persistence.Column
import jakarta.persistence.DiscriminatorValue

@DiscriminatorValue("Emoji")
class Emojicomment(
    content: String,
    writerId: Long,
    recordId: Int,
    emoji: Int
) : Comment(content, writerId, recordId) {
    @Column
    var emoji: Int = emoji
        protected set
}
