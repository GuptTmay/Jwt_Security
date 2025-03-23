package com.codewithtan.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @Value("${spring.datasource.username}")
    private String name; 

    @GetMapping("/")
    public String index() {
        return name;
    }
}
