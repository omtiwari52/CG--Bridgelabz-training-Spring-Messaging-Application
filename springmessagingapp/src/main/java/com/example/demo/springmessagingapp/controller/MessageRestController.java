package com.example.demo.springmessagingapp.controller;

import com.example.demo.springmessagingapp.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

import javax.sql.rowset.serial.SerialStruct;

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

    @PostMapping("/post")    //post request tp extract first and last name
    public String displayName(@RequestBody UserDTO user){
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz!!";
    }


    @PutMapping("/user/{firstname}")
    public String displayName2(@PathVariable String firstname, @RequestParam String lastname){
        return "Hello " + firstname + " " + lastname+ " from BridgeLabz!!";
    }
}
