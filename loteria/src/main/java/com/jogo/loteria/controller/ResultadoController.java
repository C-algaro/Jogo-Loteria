package com.jogo.loteria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ResultadoController {
    
    @GetMapping("/resultado")
    public ModelAndView resultado() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("resultado.html");
        return modelAndView;
    }
    
}
