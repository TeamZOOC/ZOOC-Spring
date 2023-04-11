package com.record.zooc.domain.repository

import User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<Long, User>
