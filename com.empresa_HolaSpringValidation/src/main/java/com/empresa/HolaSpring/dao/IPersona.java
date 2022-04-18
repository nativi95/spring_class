/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.HolaSpring.dao;

import com.empresa.HolaSpring.domain.Persona;
import org.springframework.data.repository.CrudRepository;


/**
 *
 * @author nativi
 */
public interface IPersona extends CrudRepository<Persona, Long>{
    
}
