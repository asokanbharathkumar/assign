package com.example.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Admin {

    @GetMapping("/")
    public String home() {
        return ("<h1>Hello World</h1>");
    }

}