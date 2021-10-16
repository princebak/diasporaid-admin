package com.kindev.diasporaidadmin.controller;

import com.kindev.diasporaidadmin.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {
    private RegistrationService registrationService;

    @Autowired
    public DefaultController( RegistrationService registrationService ) {
        this.registrationService = registrationService;
    }

    @GetMapping("/registrations")
    public String getRegistrations( Model model ){
        model.addAttribute( "registrations", registrationService.findAllRegistration() );
        return "registrations";
    }
    @GetMapping("/registration-details")
    public String getRegistration(){
        return "registration_details";
    }
}
