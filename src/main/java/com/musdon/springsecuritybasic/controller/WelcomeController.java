package com.musdon.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WelcomeController {

    @GetMapping("/welcome")
    public String greeting(){

        return "Welcome to spring security class";
    }
}
