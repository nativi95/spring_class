/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.HolaSpring.service;

import com.empresa.HolaSpring.domain.Persona;
import java.util.List;

/**
 *
 * @author nativi
 */
public interface PersonaService {
    public List<Persona> listarPersona();
    public void guardar(Persona persona);
    public void eliminar (Persona persona);
    public Persona encontrarPersona(Persona persona);
}
