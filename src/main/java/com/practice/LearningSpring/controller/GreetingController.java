package com.practice.LearningSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public void greeting(@RequestParam(value="name") String name){
        System.out.println("Hello, Welcome to the course");
    }
}
