package com.connectproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping(value = "/")
    public String defaultPage() {
        return "Welcome to Spring Boot default page";
    }
}
