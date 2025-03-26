package com.yashi.mongochat.repository
import com.yashi.mongochat.model.Person
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import reactor.core.publisher.Flux

interface PersonRepository : ReactiveMongoRepository<Person, String> {
    fun findByLastName(lastName: String): Flux<Person>
}
