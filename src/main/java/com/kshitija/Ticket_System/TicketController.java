package com.kshitija.Ticket_System;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @GetMapping("/health")
    public String health() {
        return "Ticket System deployed via Jenkins successfully";
    }
}
