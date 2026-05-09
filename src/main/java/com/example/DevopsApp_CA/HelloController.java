package com.example.DevopsApp_CA;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "CI/CD Pipeline Running";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }

    @GetMapping("/version")
    public String version() {
        return "Version 2.0.0";
    }
}