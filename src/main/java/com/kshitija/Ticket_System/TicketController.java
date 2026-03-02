package com.kshitija.Ticket_System;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @GetMapping("/health")
    public String health() {
        return "Morning CI/CD Auto Deploy Test Successful!!";
    }
}
