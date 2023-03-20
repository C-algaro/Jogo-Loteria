package com.jogo.loteria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ApostaController {
    
    @GetMapping("/aposta")
    public ModelAndView aposta() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("nova-aposta.html");
        return modelAndView;
    } 
}
