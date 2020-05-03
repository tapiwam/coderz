package com.tapiwamaruni.coderz.controller;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HealthController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        Long id = counter.incrementAndGet();
        return new Greeting(id, String.format(template, name));
    }

    // =====

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter @Setter @ToString
    public static class Greeting {

        private Long id;
        private String content;

    }
}
