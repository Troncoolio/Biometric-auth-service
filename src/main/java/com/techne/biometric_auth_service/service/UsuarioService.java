package com.techne.biometric_auth_service.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import com.techne.biometric_auth_service.entity.Usuario;
import com.techne.biometric_auth_service.repository.UsuarioRepository;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public Usuario registrarUsuario(String nombre, String username, String password, String rol) {
        if(usuarioRepository.findByUsername(username).isPresent()){
            throw new RuntimeException("Username Existente");
        }            
        Usuario u = new Usuario();
        u.setNombre(nombre);
        u.setUsername(username);
        u.setPassword(passwordEncoder.encode(password));
        u.setRol(rol);
        return usuarioRepository.save(u); //Aquí se ejecuta el INSERT 

    }
}
