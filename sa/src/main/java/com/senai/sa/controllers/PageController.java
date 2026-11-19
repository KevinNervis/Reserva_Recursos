package com.senai.sa.controllers;

import com.senai.sa.dtos.LoginDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping()
    public String inicio(){
       return "redirect:/login";
    }

    @GetMapping("/login")
    public String login(Model model){

        LoginDto loginDto = new LoginDto();
        model.addAttribute("loginDto", loginDto);

        return "login";
    }
    @GetMapping("/home")
    public String home(){
        return "home";
    }

}
