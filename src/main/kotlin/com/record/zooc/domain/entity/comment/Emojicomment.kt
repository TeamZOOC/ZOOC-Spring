package com.record.zooc.domain.entity.comment

import com.record.zooc.domain.entity.Account
import jakarta.persistence.Column
import jakarta.persistence.DiscriminatorValue

@DiscriminatorValue("Emoji")
class Emojicomment(
    content: String,
    account: Account,
    recordId: Int,
    emoji: Int
) : Comment(content, account, recordId) {
    @Column
    var emoji: Int = emoji
        protected set
}
