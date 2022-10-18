package com.scaler.springproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class WorkController {
    @GetMapping("/name")
    public String name(){
        return "Himanshu";
    }
}
