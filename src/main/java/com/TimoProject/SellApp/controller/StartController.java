package com.TimoProject.SellApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {



    @GetMapping(value = "/start/springboot")
    public String startSpringBoot(){
        return "Welcome to the world of spring boot";
    }

}
