package com.trabajofinal.proyecto.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
       

public class PortalControlador {
    @GetMapping("/")
    public String index (){
        return "index.html";
    }
    
     @GetMapping("/hastesocio")
    public String hastesocio (){
        return "hastesocio.html";
    }
    
     @GetMapping("/loggin")
    public String loggin (){
        return "loggin.html";
    }
}