package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class ConfigClientHandler {

    @Value("${port}")
    private String port;

    @GetMapping("/index")
    public String index() {
        return "current port: " + this.port;
    }
}
