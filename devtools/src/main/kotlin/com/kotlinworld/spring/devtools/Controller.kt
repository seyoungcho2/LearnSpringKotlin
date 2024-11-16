package com.kotlinworld.spring.devtools

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@Controller
class Controller {
    @GetMapping("/hello")
    @ResponseBody
    fun hello(): String {
        return "Hello, Kotlin World!"
    }
}