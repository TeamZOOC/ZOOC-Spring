package com.record.zooc.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Index
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(
    name = "alarm",
    indexes = [
        Index(name = "alarm_users_id_index", columnList = "user_id"),
        Index(name = "alarm_family_id_index", columnList = "family_id"),
        Index(name = "alarm_memory_id_index", columnList = "memory_id"),
    ],
)
class Alarm(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Int = 0,

    @Column(name = "created_at")
    var createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "updated_at")
    var updatedAt: LocalDateTime = LocalDateTime.now(),

    @ManyToOne
    @JoinColumn(name = "user_id")
    val users: Users,

    @ManyToOne
    @JoinColumn(name = "family_id")
    val family: Family,

    @ManyToOne
    @JoinColumn(name = "memory_id")
    val record: Memory,

)
