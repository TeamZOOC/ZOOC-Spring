package com.record.zooc.domain.entity

@Entity
class Family {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = 0
        protected set
}
