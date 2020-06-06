package com.uabc.edu.app.practica1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculadoraAvzController {

    @GetMapping("/calculadora")
    public String inicio(){

        return "calculadora";
    }

    @GetMapping("/paginaA")
    public String pagina(){

        return "calcu";
    }
    @GetMapping("/paginaB")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "calcu";
    }


}
