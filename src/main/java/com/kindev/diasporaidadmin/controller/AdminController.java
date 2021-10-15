package com.kindev.diasporaidadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {
    @GetMapping("/home")
    public String getHome(){
        return "home";
    }
}
