package com.record.zooc.domain

import jakarta.persistence.Column
import jakarta.persistence.DiscriminatorColumn
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Inheritance
import jakarta.persistence.InheritanceType
import jakarta.persistence.JoinColumn
import jakarta.persistence.JoinTable
import jakarta.persistence.ManyToMany
import jakarta.persistence.ManyToOne
import java.time.LocalDateTime

@Entity(name = "memory")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "memory_type")
class Memory(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Int,

    @Column(name = "image")
    var image: String,

    @Column(name = "content")
    var content: String,

    @ManyToOne
    @JoinColumn(name = "user_id")
    val users: Users,

    @ManyToMany
    @JoinTable(name = "pet_memory")
    val pets: List<Pet>,

    @ManyToOne
    @JoinColumn(name = "family_id")
    val family: Family,

    @Column(name = "created_at")
    var createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "updated_at")
    var updatedAt: LocalDateTime = LocalDateTime.now(),
)
