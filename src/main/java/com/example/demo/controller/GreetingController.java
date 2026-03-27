package com.example.demo.controller;

import com.example.demo.service.GreetingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    // Constructor Injection
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping
    public String getGreeting() {
        return greetingService.getGreetingMessage();
    }
}
@GetMapping("/custom")
public String getCustomGreeting(
        @RequestParam(required = false) String firstName,
        @RequestParam(required = false) String lastName) {

    return greetingService.getCustomGreeting(firstName, lastName);
}
}