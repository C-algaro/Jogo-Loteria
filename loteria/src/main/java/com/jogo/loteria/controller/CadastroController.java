package com.jogo.loteria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.jogo.loteria.model.Usuario;
import com.jogo.loteria.repository.UsuarioRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    @Autowired
    UsuarioRepository usuarioRepository;
    
    @GetMapping()
    public ModelAndView cadastro() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("register.html");
        return modelAndView;
    }      
            
    @PostMapping("/salvarUsuario")
    public ModelAndView salvarUsuario(@Valid Usuario usuario, HttpServletRequest request) {
        usuarioRepository.save(usuario);
        request.setAttribute(View.RESPONSE_STATUS_ATTRIBUTE, HttpStatus.FOUND);
        return new ModelAndView("redirect:/home");
    }
        
}
