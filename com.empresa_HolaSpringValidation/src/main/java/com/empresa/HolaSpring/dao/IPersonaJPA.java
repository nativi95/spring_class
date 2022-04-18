/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.HolaSpring.dao;

import com.empresa.HolaSpring.domain.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author nativi
 */
public interface IPersonaJPA  extends JpaRepository<Persona, Long>{
    List<Persona> findByEmail(String email);
    
    @Query(nativeQuery =false, value = " SELECT p FROM Persona p WHERE email = ?1")
    Persona readEmail(String email);
}
