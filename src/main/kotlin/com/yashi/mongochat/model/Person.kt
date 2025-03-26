package com.yashi.mongochat.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "people")
data class Person(
    @Id val id: String? = null,
    val firstName: String,
    val lastName: String,
    val age: Int
)
