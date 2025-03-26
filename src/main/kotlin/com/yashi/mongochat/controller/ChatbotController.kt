package com.yashi.mongochat.controller

import com.yashi.mongochat.model.Person
import com.yashi.mongochat.service.PersonService
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/api/chatbot")
class ChatbotController(private val personService: PersonService) {

    @PostMapping
    fun query(@RequestBody request: Map<String, String>): Flux<Person> {
        val query = request["query"] ?: return Flux.empty()

        // Handle "Find by last name" query
        return if (query.contains("last name", ignoreCase = true)) {
            val lastName = extractLastName(query)
            personService.findByLastName(lastName)
        } else {
            Flux.empty()
        }
    }

    private fun extractLastName(query: String): String {
        val words = query.split(" ")
        val index = words.indexOfLast { it.equals("name", ignoreCase = true) }
        return if (index != -1 && index + 1 < words.size) words[index + 1] else ""
    }
}
