package com.example.demo.service;

import com.example.demo.model.Greeting;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GreetingService {

    private final List<Greeting> greetingList = new ArrayList<>();
    private Long counter = 1L;

    // UC2 method
    public String getGreetingMessage() {
        return "Hello World";
    }

    // UC3 method
    public String getCustomGreeting(String firstName, String lastName) {

        if (firstName != null && lastName != null) {
            return "Hello " + firstName + " " + lastName;
        } else if (firstName != null) {
            return "Hello " + firstName;
        } else if (lastName != null) {
            return "Hello " + lastName;
        } else {
            return "Hello World";
        }
    }

    // UC4 method (SAVE)
    public Greeting saveGreeting(String message) {
        Greeting greeting = new Greeting(counter++, message);
        greetingList.add(greeting);
        return greeting;
    }
    public Greeting getGreetingById(Long id) {
        for (Greeting g : greetingList) {
            if (g.getId().equals(id)) {
                return g;
            }
        }
        return null; // if not found
    }
    public List<Greeting> getAllGreetings() {
        return greetingList;
    }
    public Greeting updateGreeting(Long id, String message) {
        for (Greeting g : greetingList) {
            if (g.getId().equals(id)) {
                // create new object with same id but updated message
                Greeting updated = new Greeting(id, message);
                greetingList.set(greetingList.indexOf(g), updated);
                return updated;
            }
        }
        return null;
    }
}
public String deleteGreeting(Long id) {
    for (Greeting g : greetingList) {
        if (g.getId().equals(id)) {
            greetingList.remove(g);
            return "Deleted successfully";
        }
    }
    return "Greeting not found";
}