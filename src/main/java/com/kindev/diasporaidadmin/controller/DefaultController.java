package com.kindev.diasporaidadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {
    @GetMapping("/registrations")
    public String getRegistrations(){
        return "registrations";
    }
    @GetMapping("/registration-details")
    public String getRegistration(){
        return "registration_details";
    }
}
