package com.record.zooc.domain

import jakarta.persistence.Column
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity(name = "emoji_comment")
@DiscriminatorValue("EmojiComment")
class EmojiComment(

    @Column(name = "emoji", nullable = false)
    var emoji: String,

) : Comment()
