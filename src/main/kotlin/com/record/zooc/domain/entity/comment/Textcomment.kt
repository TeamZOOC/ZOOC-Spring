package com.record.zooc.domain.entity.comment

import com.record.zooc.domain.entity.Account
import jakarta.persistence.DiscriminatorValue

@DiscriminatorValue("Text")
class Textcomment(
    content: String,
    account: Account,
    recordId: Int,
) : Comment(content, account, recordId)
