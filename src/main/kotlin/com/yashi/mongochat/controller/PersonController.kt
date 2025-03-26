package com.yashi.mongochat.controller
import com.yashi.mongochat.model.Person
import com.yashi.mongochat.service.PersonService
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/api/people")
class PersonController(private val personService: PersonService) {

    @GetMapping
    fun getAllPeople(): Flux<Person> = personService.getAllPeople()

    @GetMapping("/search")
    fun searchByLastName(@RequestParam lastName: String): Flux<Person> {
        return personService.findByLastName(lastName)
    }
}
