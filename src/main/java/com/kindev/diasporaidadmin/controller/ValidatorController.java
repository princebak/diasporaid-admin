package com.kindev.diasporaidadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ValidatorController {
    @PostMapping("/registration-details")
    public String getRegistration(){
        return "registration_details";
    }
}
