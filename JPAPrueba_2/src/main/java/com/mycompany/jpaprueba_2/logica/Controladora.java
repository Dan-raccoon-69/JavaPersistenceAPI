package com.mycompany.jpaprueba_2.logica;

import com.mycompany.jpaprueba_2.persistencia.ControladoraPersistencia;
import com.mycompany.jpaprueba_2.persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Daniel
 */
public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearAlumno(Alumno alumno){
        controlPersis.crearAlumno(alumno);
    }
    
    public void eliminarAlumno(int id) throws NonexistentEntityException{
        controlPersis.eliminarAlumno(id);
    }
    
    public void modificarAlumno(Alumno alumno){
        controlPersis.crearAlumno(alumno);
    }
    
}
