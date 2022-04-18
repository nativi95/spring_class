/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.HolaSpring.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;


/**
 *
 * @author nativi
 */
@Data
@Entity
@Table(name="personas")
public class Persona implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    
    @NotEmpty
    private String nombre;
    
    
    private String apellido;
    
    
    private String email;
    
   
    private String telefono;

    public Persona(Long idPersona, String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public Persona() {
    }

    public Persona(Long idPersona) {
        this.idPersona = idPersona;
    }
    
    
    
    
}
