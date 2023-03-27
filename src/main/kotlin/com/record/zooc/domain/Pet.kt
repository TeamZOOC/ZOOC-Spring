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
    name = "pets",
    indexes = [
        Index(name = "pet_users_id_index", columnList = "user_id"),
        Index(columnList = "user_id", name = "pet_users_id_index"),
    ],
)
class Pet(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Int = 0,

    @Column(name = "profile_image")
    var profileImage: String,

    @Column(name = "name")
    var name: String,

    @ManyToOne
    @JoinColumn(name = "user_id")
    val users: Users,

    @ManyToOne
    @JoinColumn(name = "family_id")
    val family: Family,

    @Column(name = "created_at")
    var createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "updated_at")
    var updatedAt: LocalDateTime = LocalDateTime.now()
)
