package com.record.zooc.domain

import jakarta.persistence.Column
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity
@DiscriminatorValue("EMOJICOMMENT")
class EmojiComment (

    @Column(name = "emoji", nullable = false)
    var emoji: String,

): Comment(()
)
