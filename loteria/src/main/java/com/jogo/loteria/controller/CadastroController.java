package com.jogo.loteria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.jogo.loteria.Repository.UsuarioRepository;
import com.jogo.loteria.model.Usuario;

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
    public ModelAndView salvarUsuario(@ModelAttribute("usuario") @Valid Usuario usuario, BindingResult bindingResult) {
        ModelAndView mv = new ModelAndView();
        //adcionar comparação de senha e os erros
        if(bindingResult.hasErrors()){
            mv.setViewName("redirect:/cadastro");
            mv.addObject(usuario);
            return mv;
        }
        mv.setViewName("redirect:/home");
        usuarioRepository.save(usuario);
        return mv;
    }
        
}
