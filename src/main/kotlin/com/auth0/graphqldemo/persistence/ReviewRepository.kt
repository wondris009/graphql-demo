package com.auth0.graphqldemo.persistence

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ReviewRepository: MongoRepository<Review, String>