package com.example.sample_serverside_kotlin.demo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

/**
 * RestController : for API
 * Controller : for HTML
 */
@Controller
class Hello {

    // for html
    @GetMapping("/")
    fun index(model: Model): String {
        model.addAttribute("Greeting", "Hello World!") // name to value
        return "index"
    }

    // for REST
//    @RequestMapping("/")
//    fun index(): String {
//        return "Hello World!"
//    }
}