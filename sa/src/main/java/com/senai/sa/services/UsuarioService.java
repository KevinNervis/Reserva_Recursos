package com.senai.sa.services;

import com.senai.sa.dtos.LoginDto;
import com.senai.sa.entities.UsuarioEntity;
import com.senai.sa.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Boolean fazendoLogin(LoginDto loginDto){
        return repository.findByEmailAndSenha(loginDto.getEmail(),loginDto.getSenha()).isPresent();
    }
}