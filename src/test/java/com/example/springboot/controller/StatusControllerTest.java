package com.example.springboot.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatusControllerTest {

    private final StatusController controller = new StatusController();

    @Test
    void homeReturnsApplicationStatus() {
        assertEquals("Aplicação online", controller.home());
    }

    @Test
    void healthReturnsOk() {
        assertEquals("OK", controller.health());
    }
}
