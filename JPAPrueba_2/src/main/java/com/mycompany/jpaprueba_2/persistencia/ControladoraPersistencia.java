/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpaprueba_2.persistencia;

import com.mycompany.jpaprueba_2.logica.Alumno;
import com.mycompany.jpaprueba_2.persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Daniel
 */
public class ControladoraPersistencia {
    // controlara cada una de las instancias de las JPA controler que tengamos
    AlumnoJpaController aluJpa = new AlumnoJpaController();

    public void crearAlumno(Alumno alumno) {
        aluJpa.create(alumno);
    }
    
    public void modificarAlumno(Alumno alumno) throws Exception {
        aluJpa.edit(alumno);
    }
    
    public void eliminarAlumno(int id) throws NonexistentEntityException {
        aluJpa.destroy(id);
    }
}
