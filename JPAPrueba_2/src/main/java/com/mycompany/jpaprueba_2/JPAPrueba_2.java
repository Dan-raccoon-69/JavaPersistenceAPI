/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jpaprueba_2;

import com.mycompany.jpaprueba_2.logica.Alumno;
import com.mycompany.jpaprueba_2.logica.Controladora;
import com.mycompany.jpaprueba_2.persistencia.ControladoraPersistencia;
import com.mycompany.jpaprueba_2.persistencia.exceptions.NonexistentEntityException;
import java.util.Date;

/**
 *
 * @author Daniel
 */
public class JPAPrueba_2 {

    public static void main(String[] args) throws NonexistentEntityException {
        Controladora ctr = new Controladora();
        
        
        Alumno alumno = new Alumno(4, "Miguel", "Martinez", new Date());
        
        ctr.crearAlumno(alumno);
        
        // ctr.eliminarAlumno(3);
        
        
        alumno.setApellido("Gomez");
        ctr.modificarAlumno(alumno);
        
    }
}
