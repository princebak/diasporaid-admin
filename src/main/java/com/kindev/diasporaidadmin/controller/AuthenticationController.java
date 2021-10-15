package com.kindev.diasporaidadmin.controller;

import com.kindev.diasporaidadmin.model.User;
import com.kindev.diasporaidadmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class AuthenticationController {

    private UserService userService;
    @Autowired
    public AuthenticationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping({"/", "/login"})
    public String getLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String postLogin( @RequestParam String username, @RequestParam String password, HttpServletRequest request ) {
        User foundUser = userService.findUser( new User(username, password, "") );
        String page = "";

        if( foundUser == null ){
            page = "redirect:/login";
        }else{
            HttpSession session = request.getSession();
            session.setAttribute( "user", foundUser );
            if( foundUser.getUserType().equalsIgnoreCase("admin") ){
                page = "redirect:/home";
            }else{
                page = "redirect:/registrations";
            }
        }

        return page;
    }

    @PostMapping("/signup")
    public String postSignup(@RequestBody User user){
        userService.createUser( user );

        return "redirect:/login";
    }

    @GetMapping("/logout")
    public String getLogout( HttpServletRequest request){
        HttpSession session = request.getSession();
        session.removeAttribute("user");

        return "redirect:/login";
    }
    @GetMapping("/reset")
    public String getReset(){
        return "reset";
    }
    @PostMapping("/reset")
    public String postReset(){
        return "redirect:/reset-confirm";
    }
    @GetMapping("/reset-confirm")
    public String getResetConfirm(){
        return "reset_confirm";
    }
    @PostMapping("/reset-confirm")
    public String postResetConfirm(){
        return "redirect:/login";
    }
}
