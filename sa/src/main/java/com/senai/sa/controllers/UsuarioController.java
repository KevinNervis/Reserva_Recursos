package com.senai.sa.controllers;

import com.senai.sa.dtos.LoginDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @PostMapping("/login")
    public String realizarLogin(@ModelAttribute("loginDto") LoginDto loginDto){

        System.out.println("Email: " + loginDto.getEmail());
        System.out.println("Senha: " + loginDto.getSenha());
        if (loginDto.getEmail().equals("aluno@senai.com") && loginDto.getSenha().equals("123")){
            //certo
            System.out.println("Deu certo");
        }else {
            //erro
            System.out.println("Deu errado");
        }
        return "redirect:/login";
    }

}
