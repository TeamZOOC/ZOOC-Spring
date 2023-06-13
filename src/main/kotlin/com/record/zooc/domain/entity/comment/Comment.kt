package com.record.zooc.domain.entity.comment

import com.record.zooc.domain.entity.Account
import com.record.zooc.domain.entity.base.ModifiedTimeEntity
import jakarta.persistence.Column
import jakarta.persistence.DiscriminatorColumn
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Inheritance
import jakarta.persistence.InheritanceType
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne
import jakarta.persistence.Table

@DiscriminatorColumn(name = "comment_type")
@Entity
@Table(name = "comment")
@Inheritance(strategy = InheritanceType.JOINED)
class Comment(
    content: String,
    account: Account,
    memoryId: Int,

) : ModifiedTimeEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = 0
        protected set

    @Column
    var content: String = content
        protected set

    @OneToOne
    @JoinColumn(name = "writer_id")
    var writer: Account = account
        protected set

    @Column
    var memoryId: Int = memoryId
        protected set

    fun updateContent(
        content: String,
    ) {
        this.content = content
    }
}
