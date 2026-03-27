package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    // GET method
    @GetMapping
    public String getGreeting() {
        return "Hello from GET";
    }

    // POST method
    @PostMapping
    public String postGreeting() {
        return "Hello from POST";
    }

    // PUT method
    @PutMapping
    public String putGreeting() {
        return "Hello from PUT";
    }

    // DELETE method
    @DeleteMapping
    public String deleteGreeting() {
        return "Hello from DELETE";
    }
}