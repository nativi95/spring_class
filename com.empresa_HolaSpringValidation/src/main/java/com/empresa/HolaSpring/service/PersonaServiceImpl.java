/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.HolaSpring.service;

import com.empresa.HolaSpring.dao.IPersona;
import com.empresa.HolaSpring.dao.IPersonaJPA;
import com.empresa.HolaSpring.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author nativi
 */
@Slf4j
@Service
public class PersonaServiceImpl implements PersonaService{
    
    @Autowired
    private IPersona ipersona;
    
    @Autowired
    private IPersonaJPA ipj; 

    @Override
    @Transactional(readOnly = true)//para convertir este metodo como transaccional de tipo solo lectura
    public List<Persona> listarPersona() {
        return (List<Persona>)ipersona.findAll();
    }

    @Override
    @Transactional
    public void guardar(Persona persona) {
        ipersona.save(persona);
    }

    @Override
    @Transactional //para convertir este metodo como transaccional de tipo escritura
    public void eliminar(Persona persona) {
        ipersona.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPersona(Persona persona) {
        return ipersona.findById(persona.getIdPersona()).orElse(null);
    }
    
}
