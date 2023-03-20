package com.jogo.loteria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jogo.loteria.model.Usuario;
import com.jogo.loteria.repository.UsuarioRepository;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping()
    @ResponseBody
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }


    @PostMapping("/salvarUsuario")
    public ResponseEntity<Usuario> salvarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    
}
