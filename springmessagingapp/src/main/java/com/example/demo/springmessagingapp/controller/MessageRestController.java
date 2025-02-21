package com.example.demo.springmessagingapp.controller;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{name}")
    public String usingPathVariable(@PathVariable String name){
        return "Hello, " + name + " from BridgeLabz!";
    }
}
