package com.yashi.mongochat.service

import com.yashi.mongochat.model.Person
import com.yashi.mongochat.repository.PersonRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class PersonService(private val personRepository: PersonRepository) {
    fun findByLastName(lastName: String): Flux<Person> = personRepository.findByLastName(lastName)

    fun getAllPeople(): Flux<Person> = personRepository.findAll()
}

