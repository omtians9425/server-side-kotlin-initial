package com.example.sample_serverside_kotlin.demo

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * RestController : for API
 * Controller : for HTML
 */
@RestController
class Hello {
    @RequestMapping("/")
    fun index(): String {
        return "Hello World!"
    }
}