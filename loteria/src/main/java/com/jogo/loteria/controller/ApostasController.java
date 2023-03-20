package com.jogo.loteria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/apostas")
public class ApostasController {

    @GetMapping()
    public ModelAndView cadastro() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("apostas.html");
        return modelAndView;
    }

}
