package com.example.demo.springmessagingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class MessageRestController {

    @GetMapping   //get request to print message
    public String hello() {
        return "Hello from BridgeLabz";
    }

    @GetMapping("/")
    public String sayHello(@RequestParam String name) {
        return "Hello, " + name + " from BridgeLabz!";
    }
}
