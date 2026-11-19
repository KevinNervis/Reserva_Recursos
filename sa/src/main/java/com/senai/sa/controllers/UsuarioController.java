package com.senai.sa.controllers;

import com.senai.sa.dtos.LoginDto;
import com.senai.sa.services.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {
    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @PostMapping("/login")
    public String realizarLogin(@ModelAttribute("loginDto") LoginDto loginDto, Model model){

        if (service.fazendoLogin(loginDto)){
            return "redirect:/home";
        }
            model.addAttribute("erro", "E-mail ou senha invalida!!!");
            return "login";
    }
}
