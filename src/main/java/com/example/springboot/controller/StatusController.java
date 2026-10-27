package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/")
    public String home() {
        return "Aplicação online";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
