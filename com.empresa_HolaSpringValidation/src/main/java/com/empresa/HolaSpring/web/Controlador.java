/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.HolaSpring.web;

import com.empresa.HolaSpring.domain.Persona;
import com.empresa.HolaSpring.service.PersonaService;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author nativi
 */
@Controller
@Slf4j
public class Controlador {
    
    @Autowired
    private PersonaService personaS;

    @GetMapping("/")
    public String inicio(Model model) {
        log.info("+++++++++++++Ejecuntando el controlador Spring MVC+++++++++++++++++");
        model.addAttribute("personas", personaS.listarPersona());
        return "index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Persona persona){
        return "modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(@Valid Persona persona, Errors errores){
        if(errores.hasErrors()){
            return "modificar";
        }
        personaS.guardar(persona);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{idPersona}")
    public String editar(Persona persona, Model model){
        persona = personaS.encontrarPersona(persona);
        log.info("L50 EL nombre es :"+persona.getNombre());
        model.addAttribute("persona", persona);
        return "modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(Persona persona){
        personaS.eliminar(persona);
        return "redirect:/";
    }
}
